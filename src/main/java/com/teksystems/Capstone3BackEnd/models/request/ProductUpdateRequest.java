package com.teksystems.Capstone3BackEnd.models.request;

public class ProductUpdateRequest {
    private String productName;
    private int quantity;

    public ProductUpdateRequest(String productId, String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

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
