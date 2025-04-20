package com.example.demo.controllers;

import com.example.demo.dto.PointOfSaleResponseDTO;
import com.example.demo.entities.PointOfSale;
import com.example.demo.services.PointOfSaleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pos")
public class PointOfSaleController {
    /**
     * For Log back defualt logging, you have to use SLF4J (Simple Logging Facade for Java)
     */
    private static final Logger logger = LoggerFactory.getLogger(PointOfSaleController.class);

    @Autowired
    private PointOfSaleService pointOfSaleService;

    @GetMapping("/getPointOfSaleDataByItemId/{id}")
    public ResponseEntity<PointOfSaleResponseDTO> getPointOfSaleDataByItemId(@PathVariable("id") String itemId) {
        PointOfSaleResponseDTO pointOfSaleResponseDTO = null;
        try {
            pointOfSaleResponseDTO = pointOfSaleService.getPointOfSaleDataByItemId(itemId);
        } catch (Exception e) {
            logger.error("unable to access Item Data...");
        }
        return ResponseEntity.ok(pointOfSaleResponseDTO);
    }

    @GetMapping("/getPointOfSaleDataByItemName/{itemName}")
    public ResponseEntity<PointOfSaleResponseDTO> getPointOfSaleDataByItemName(@PathVariable("itemName") String itemName) {
        PointOfSaleResponseDTO pointOfSaleResponseDTO = null;
        try {
            pointOfSaleResponseDTO = pointOfSaleService.getPointOfSaleDataByItemName(itemName);
        } catch (Exception e) {
            logger.error("unable to access Item Data...");
        }
        return ResponseEntity.ok(pointOfSaleResponseDTO);
    }

    @PostMapping("/generateItemsDataPdf")
    public void getItemDataPdf() {
        try {
            pointOfSaleService.getItemDataPdf();
        } catch (Exception e) {
            logger.error("unable to generate Item Data Pdf...");
        }
    }

}
