package com.example.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grocery.dao.GroceryDao;
import com.example.grocery.model.GroceryItem;

@Service
public class GroceryService {
	 @Autowired
	 private GroceryDao groceryDao;

    public List<GroceryItem> getAllItems() {
        return groceryDao.getAllItems();
    }

    public void addItem(GroceryItem item) {
        groceryDao.addItem(item);
    }
}
