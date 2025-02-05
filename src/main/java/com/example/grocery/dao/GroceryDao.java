package com.example.grocery.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.grocery.model.GroceryItem;

@Repository
public class GroceryDao {
	@Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<GroceryItem> getAllItems() {
        String sql = "SELECT * FROM grocery_items";
        return jdbcTemplate.query(sql, new GroceryItemRowMapper());
    }

    public void addItem(GroceryItem item) {
        String sql = "INSERT INTO grocery_items (name, price, quantity) VALUES (:name, :price, :quantity)";
        Map<String, Object> params = new HashMap<>();
        params.put("name", item.getName());
        params.put("price", item.getPrice());
        params.put("quantity", item.getQuantity());
        jdbcTemplate.update(sql, params);
    }
}
