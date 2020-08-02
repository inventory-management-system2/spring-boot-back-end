package com.teksystems.Capstone3BackEnd.dto;



public class ProductDto {
    private Long id;
    private String productName;
    private int quantity;
    private String serialNumber;
    private Double price;
    private String category;
    private String imageUrl;

    public ProductDto(Long id, String productName, int quantity, String serialNumber, Double price,
                         String category, String imageUrl) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.serialNumber = serialNumber;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
    }
    public ProductDto(String productName, int quantity, String serialNumber, Double price,
                      String category, String imageUrl) {
        this.productName = productName;
        this.quantity = quantity;
        this.serialNumber = serialNumber;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
    }


    public ProductDto(String productName, int quantity){
        this.productName = productName;
        this.quantity = quantity;
    }

    public ProductDto(){}


    public Long getId() {
        return id;
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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}