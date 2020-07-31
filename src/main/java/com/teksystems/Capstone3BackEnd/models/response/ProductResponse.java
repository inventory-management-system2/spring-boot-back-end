package com.teksystems.Capstone3BackEnd.models.response;

public class ProductResponse {
    private String productName;
    private int quantity;

    public ProductResponse(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }
    public ProductResponse(){}

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
