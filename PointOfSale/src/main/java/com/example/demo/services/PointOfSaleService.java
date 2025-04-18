package com.example.demo.services;

import com.example.demo.dto.ItemResponseDTO;
import com.example.demo.dto.PointOfSaleResponseDTO;
import com.example.demo.dto.StockResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PointOfSaleService {

//    @Autowired
//    private PointOfSaleRepository pointOfSaleRepository;

    @Autowired
    private RestTemplate restTemplate;

    private static final String ITEM_SERVICE_BASE_URL = "http://localhost:8081/api/item";
    private static final String INVENTORY_SERVICE_BASE_URL = "http://localhost:8082/api/stock";

    public PointOfSaleResponseDTO getPointOfSaleDataByItemId(String itemId) {

        /**
         * In this perticular execution 1 Thread will be used.First Thread will call item service wait for response, then again
         * same thread calls inventory service and waits for response. after got response same thread will prepare response and
         * give it back. So we have to call parallally for better response time. Refer multi threading project.
         */
        String itemUrl = ITEM_SERVICE_BASE_URL + "/getItemById/" + itemId;
        ItemResponseDTO itemResponseDTO = restTemplate.getForObject(itemUrl, ItemResponseDTO.class);

        String inventoryUrl = INVENTORY_SERVICE_BASE_URL + "/getStockByItemId/" + itemId;
        StockResponseDTO stockResponseDTO = restTemplate.getForObject(inventoryUrl, StockResponseDTO.class);

        PointOfSaleResponseDTO pointOfSaleResponseDTO = new PointOfSaleResponseDTO();
        pointOfSaleResponseDTO.setItemId(itemResponseDTO.getId());
        pointOfSaleResponseDTO.setItemName(itemResponseDTO.getName());
        pointOfSaleResponseDTO.setAvailableStock(stockResponseDTO.getAvailableStock());
        return pointOfSaleResponseDTO;
    }


}
