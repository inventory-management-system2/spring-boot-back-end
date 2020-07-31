package com.teksystems.Capstone3BackEnd.models.response;

public class ProductResponse {
	private String productId; 
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
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
    
    
}
