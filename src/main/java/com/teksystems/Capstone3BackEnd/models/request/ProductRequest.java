package com.teksystems.Capstone3BackEnd.models.request;

public class ProductRequest {
    private String productName;
    private int quantity;

    public ProductRequest(String productId, String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }
    public ProductRequest(){}

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}