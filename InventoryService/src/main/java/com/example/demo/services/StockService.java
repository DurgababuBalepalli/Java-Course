package com.example.demo.services;

import com.example.demo.entities.Stock;
import com.example.demo.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public Stock getStockByItemId(String itemId) {
        Stock stock =  stockRepository.findByItemId(itemId).orElse(null);
        return stock;
    }

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }
}
