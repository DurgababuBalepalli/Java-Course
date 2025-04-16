package com.example.demo.controllers;

import com.example.demo.dto.StockResponseDTO;
import com.example.demo.entities.Stock;
import com.example.demo.services.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stock")
public class StockController {
    /**
     * For Log back defualt logging, you have to use SLF4J (Simple Logging Facade for Java)
     */
    private static final Logger logger = LoggerFactory.getLogger(StockController.class);

    @Autowired
    private StockService stockService;

    @GetMapping("/getStockByItemId/{id}")
    public ResponseEntity<StockResponseDTO> getStockByItemId(@PathVariable("id") String itemId) {
        StockResponseDTO stockResponseDTO = new StockResponseDTO();
        try {
            Stock stock = stockService.getStockByItemId(itemId);
            stockResponseDTO.setItemId(stock.getItemId());
            stockResponseDTO.setAvailableStock(stock.getAvailableStock());
        } catch (Exception e) {
            logger.error("unable to access Item Data...");
        }
        return ResponseEntity.ok(stockResponseDTO);
    }

    @GetMapping("/getAllStocks")
    public ResponseEntity<List<Stock>> getAllStocks(){
        return ResponseEntity.ok(stockService.getAllStocks());
    }
}
