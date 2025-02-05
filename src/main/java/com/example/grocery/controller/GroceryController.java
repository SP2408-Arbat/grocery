package com.example.grocery.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.grocery.model.GroceryItem;
import com.example.grocery.service.GroceryService;

@RestController
@RequestMapping("/grocery")
public class GroceryController {
    
    @Autowired
    private GroceryService groceryService;

    @GetMapping("/items")
    public List<GroceryItem> getGroceryItems() {
        return groceryService.getAllItems();
    }

    @PostMapping("/add")
    public String addGroceryItem(@RequestBody GroceryItem item) {
        groceryService.addItem(item);
        return "Item added successfully!";
    }
}
