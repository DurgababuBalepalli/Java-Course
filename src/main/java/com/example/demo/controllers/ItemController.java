package com.example.demo.controllers;

import com.example.demo.dto.ItemResponseDTO;
import com.example.demo.entities.Item;
import com.example.demo.services.ItemService;
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
@RequestMapping("/api/item")
public class ItemController {
    /**
     * For Log back defualt logging, you have to use SLF4J (Simple Logging Facade for Java)
     */
    private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;

    @GetMapping("/getItemById/{id}")
    public ResponseEntity<ItemResponseDTO> getItemById(@PathVariable("id") String itemId) {
        ItemResponseDTO itemResponseDTO = new ItemResponseDTO();
        try {
            Item item = itemService.getItemById(itemId);
            itemResponseDTO.setId(item.getId());
            itemResponseDTO.setName(item.getName());
        } catch (Exception e) {
            logger.error("unable to access Item Data...");
        }
        return ResponseEntity.ok(itemResponseDTO);
    }

    @GetMapping("/getAllItems")
    public ResponseEntity<List<Item>> getAllUsers(){
        return ResponseEntity.ok(itemService.getAllItems());
    }
}
