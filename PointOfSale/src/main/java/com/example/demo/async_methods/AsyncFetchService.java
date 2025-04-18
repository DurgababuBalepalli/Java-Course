package com.example.demo.async_methods;

import com.example.demo.dto.ItemResponseDTO;
import com.example.demo.dto.StockResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

/**
 * If i define the methods inside PointOfSale service class itself, Spring AOP (Which powers @Async) won't work. because it ignores @Async for internal calls.
 * if you want try, keep these methods in PointOfSale Service and observe, every time Same thread being used, that means it is not using @Async Power.
 */
@Service
public class AsyncFetchService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String ITEM_SERVICE_BASE_URL = "http://localhost:8081/api/item";
    private static final String INVENTORY_SERVICE_BASE_URL = "http://localhost:8082/api/stock";

    @Async
    public CompletableFuture<ItemResponseDTO> getItemByIdAsync(String itemId) {
        System.out.println("Fetching Item on Thread : "+Thread.currentThread().getName());
        String itemUrl = ITEM_SERVICE_BASE_URL + "/getItemById/" + itemId;
        ItemResponseDTO itemResponseDTO = restTemplate.getForObject(itemUrl, ItemResponseDTO.class);
        return CompletableFuture.completedFuture(itemResponseDTO);
    }

    @Async
    public CompletableFuture<StockResponseDTO> getStockByItemIdAsync(String itemId) {
        System.out.println("Fetching Stock on Thread : "+Thread.currentThread().getName());
        String inventoryUrl = INVENTORY_SERVICE_BASE_URL + "/getStockByItemId/" + itemId;
        StockResponseDTO stockResponseDTO = restTemplate.getForObject(inventoryUrl, StockResponseDTO.class);
        return CompletableFuture.completedFuture(stockResponseDTO);
    }
}
