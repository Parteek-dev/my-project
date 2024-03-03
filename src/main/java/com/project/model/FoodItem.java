package com.project.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FoodItem {

    @JsonProperty("Cuisine")
    private String cuisine;

    @JsonProperty("ItemList")
    private List<String> itemList;

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public List<String> getItemList() {
        return itemList;
    }

    public void setItemList(List<String> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "cuisine='" + cuisine + '\'' +
                ", itemList=" + itemList +
                '}';
    }
}
