package com.project.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.model.Cuisine;
import com.project.model.FoodDetail;
import com.project.model.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CuisineDataService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Cuisine getCuisineList(int userId) {
        String jsonString = jdbcTemplate.queryForObject("SELECT getcuisinelist(?)", String.class,userId);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonString, Cuisine.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public FoodItem getItemList(String cuisine) {
        String jsonString = jdbcTemplate.queryForObject("SELECT getitemlist(?)", String.class,cuisine);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonString, FoodItem.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public FoodDetail getItemDetail(String itemName) {
        String jsonString = jdbcTemplate.queryForObject("SELECT getitemdetails(?)", String.class,itemName);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonString, FoodDetail.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
