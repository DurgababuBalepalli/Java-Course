package com.example.demo.services;

import com.example.demo.entities.Item;
import com.example.demo.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item getItemById(String itemId) {
        Item item =  itemRepository.findById(itemId).orElse(null);
        return item;
    }

    public Item getItemByName(String itemName) {
        Item item =  itemRepository.getItemByName(itemName).orElse(null);
        return item;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
