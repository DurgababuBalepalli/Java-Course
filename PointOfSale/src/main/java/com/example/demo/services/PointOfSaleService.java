package com.example.demo.services;

import com.example.demo.async_methods.AsyncFetchService;
import com.example.demo.dto.ItemResponseDTO;
import com.example.demo.dto.PointOfSaleResponseDTO;
import com.example.demo.dto.StockResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
public class PointOfSaleService {

//    @Autowired
//    private PointOfSaleRepository pointOfSaleRepository;

    @Autowired
    private AsyncFetchService asyncFetchService;

    public PointOfSaleResponseDTO getPointOfSaleDataByItemId(String itemId) throws ExecutionException, InterruptedException {

        /**
         * In this perticular execution 1 Thread will be used.First Thread will call item service wait for response, then again
         * same thread calls inventory service and waits for response. after got response same thread will prepare response and
         * give it back. So we have to call parallally for better response time. Now response time is 1sec.
         * Now lets do with multiple threads with Async Calls
         * CompletableFuture<ItemResponseDTO> is just a wrapper, in order to get actual objects we have to use get
         */

        /* String itemUrl = ITEM_SERVICE_BASE_URL + "/getItemById/" + itemId;
        ItemResponseDTO itemResponseDTO = restTemplate.getForObject(itemUrl, ItemResponseDTO.class);

        String inventoryUrl = INVENTORY_SERVICE_BASE_URL + "/getStockByItemId/" + itemId;
        StockResponseDTO stockResponseDTO = restTemplate.getForObject(inventoryUrl, StockResponseDTO.class); */

        System.out.println("Running on current thread: " + Thread.currentThread().getName());

        CompletableFuture<ItemResponseDTO> itemResponseDTOCompletableFuture = asyncFetchService.getItemByIdAsync(itemId);
        CompletableFuture<StockResponseDTO> stockResponseDTOCompletableFuture = asyncFetchService.getStockByItemIdAsync(itemId);
        CompletableFuture.allOf(itemResponseDTOCompletableFuture,stockResponseDTOCompletableFuture).join();

        ItemResponseDTO itemResponseDTO = itemResponseDTOCompletableFuture.get();
        StockResponseDTO stockResponseDTO = stockResponseDTOCompletableFuture.get();

        PointOfSaleResponseDTO pointOfSaleResponseDTO = new PointOfSaleResponseDTO();
        pointOfSaleResponseDTO.setItemId(itemResponseDTO.getId());
        pointOfSaleResponseDTO.setItemName(itemResponseDTO.getName());
        pointOfSaleResponseDTO.setAvailableStock(stockResponseDTO.getAvailableStock());
        return pointOfSaleResponseDTO;
    }


}
