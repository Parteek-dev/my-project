package com.project.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Cuisine {

    @JsonProperty("userId")
    private int userId;
    @JsonProperty("CuisineList")
    private List<String> cuisineList;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<String> getCuisineList() {
        return cuisineList;
    }

    public void setCuisineList(List<String> cuisineList) {
        this.cuisineList = cuisineList;
    }

    @Override
    public String toString() {
        return "Cuisine{" +
                "userId='" + userId + '\'' +
                ", cuisineList=" + cuisineList +
                '}';
    }
}
