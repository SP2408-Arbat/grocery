package com.example.grocery.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.grocery.model.GroceryItem;

public class GroceryItemRowMapper implements RowMapper<GroceryItem> {
    @Override
    public GroceryItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        GroceryItem item = new GroceryItem();
        item.setId(rs.getInt("id"));
        item.setName(rs.getString("name"));
        item.setPrice(rs.getDouble("price"));
        item.setQuantity(rs.getInt("quantity"));
        return item;
    }
}
