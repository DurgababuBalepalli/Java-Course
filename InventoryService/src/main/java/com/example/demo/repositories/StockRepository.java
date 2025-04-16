package com.example.demo.repositories;

import com.example.demo.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock,String> {
    Optional<Stock> findByItemId(String itemId);
}
