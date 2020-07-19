package com.example.analyticsdemo.model;

public class Item {
    private String id;
    private String name;
    private String category;
    private String variant;
    private String brand;
    private double price;
    private String currency;
    private long quantity;

    public Item(String id, String name, String category, String variant, String brand, double price, String currency, long quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.variant = variant;
        this.brand = brand;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
