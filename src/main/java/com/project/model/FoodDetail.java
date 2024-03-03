package com.project.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class FoodDetail {
    @JsonProperty("ItemName")
    private String itemName;
    @JsonProperty("AvgPrice")
    private Double avgPrice;
    @JsonProperty("AvgDiscount")
    private Double avgDiscount;
    @JsonProperty("AvgDeliveryTime")
    private int avgDeliveryTime;
    @JsonProperty("AvgRating")
    private Long avgRating;
    @JsonProperty("PriceTrend")
    private Map<String,Double> priceTrend;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Double getAvgDiscount() {
        return avgDiscount;
    }

    public void setAvgDiscount(Double avgDiscount) {
        this.avgDiscount = avgDiscount;
    }

    public int getAvgDeliveryTime() {
        return avgDeliveryTime;
    }

    public void setAvgDeliveryTime(int avgDeliveryTime) {
        this.avgDeliveryTime = avgDeliveryTime;
    }

    public Long getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(Long avgRating) {
        this.avgRating = avgRating;
    }

    public Map<String, Double> getPriceTrend() {
        return priceTrend;
    }

    public void setPriceTrend(Map<String, Double> priceTrend) {
        this.priceTrend = priceTrend;
    }

    @Override
    public String toString() {
        return "FoodDetail{" +
                "ItemName='" + itemName + '\'' +
                ", AvgPrice=" + avgPrice +
                ", AvgDiscount=" + avgDiscount +
                ", AvgDeliveryTime=" + avgDeliveryTime +
                ", AvgRating=" + avgRating +
                ", PriceTrend=" + priceTrend +
                '}';
    }
}
