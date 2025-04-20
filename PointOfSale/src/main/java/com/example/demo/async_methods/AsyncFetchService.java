package com.example.demo.async_methods;

import com.example.demo.dto.ItemResponseDTO;
import com.example.demo.dto.StockResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * If i define the methods inside PointOfSale service class itself, Spring AOP (Which powers @Async) won't work. because it ignores @Async for internal calls.
 * if you want try, keep these methods in PointOfSale Service and observe, every time Same thread being used, that means it is not using @Async Power.
 * Now if you observe default task executor pool will be used for all the methods, even for 3rd method, which is generating PDF.
 * The problem is if all threads are occupied with PDF generation (which are given by task executor), threads starvation will happen.
 * So we can define custom task executor. each custom executor has it own thread pool. so short running tasks won't stuck due to long running tasks(pdf generation)
 * If you have a single executor(default task executor or custom single task executor) and many long-running tasks, short-lived or critical tasks might get stuck waiting.
 */
@Service
public class AsyncFetchService {

    @Autowired
    private RestTemplate restTemplate;

    public static final String ITEM_SERVICE_BASE_URL = "http://localhost:8081/api/item";
    public static final String INVENTORY_SERVICE_BASE_URL = "http://localhost:8082/api/stock";

    @Async("externalServiceExecutor")
    public CompletableFuture<ItemResponseDTO> getItemByIdAsync(String itemId) {
        System.out.println("Fetching Item on Thread : "+Thread.currentThread().getName());
        String itemUrl = ITEM_SERVICE_BASE_URL + "/getItemById/" + itemId;
        ItemResponseDTO itemResponseDTO = restTemplate.getForObject(itemUrl, ItemResponseDTO.class);
        return CompletableFuture.completedFuture(itemResponseDTO);
    }

    @Async("externalServiceExecutor")
    public CompletableFuture<StockResponseDTO> getStockByItemIdAsync(String itemId) {
        System.out.println("Fetching Stock on Thread : "+Thread.currentThread().getName());
        String inventoryUrl = INVENTORY_SERVICE_BASE_URL + "/getStockByItemId/" + itemId;
        StockResponseDTO stockResponseDTO = restTemplate.getForObject(inventoryUrl, StockResponseDTO.class);
        return CompletableFuture.completedFuture(stockResponseDTO);
    }

    @Async("pdfExecutor")
    public CompletableFuture<List<ItemResponseDTO>> getAllItemListAsync() {
        System.out.println("Fetching All Items on Thread : "+Thread.currentThread().getName());
        String itemUrl = ITEM_SERVICE_BASE_URL + "/getAllItems";
        ResponseEntity<List<ItemResponseDTO>> itemResponseDTOEntities = restTemplate.exchange(itemUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<ItemResponseDTO>>(){});
        List<ItemResponseDTO> itemResponseDTOList = itemResponseDTOEntities.getBody();
        System.out.println("Fetched items: " + itemResponseDTOList.size());
        return CompletableFuture.completedFuture(itemResponseDTOList);
    }
}
