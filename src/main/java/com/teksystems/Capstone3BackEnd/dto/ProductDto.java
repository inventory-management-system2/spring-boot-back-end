package com.teksystems.Capstone3BackEnd.dto;

public class ProductDto {
    private Long id;
    private String productName;
    private int quantity;
    private String serialNumber;
    private Double price;
    private String category;
    private String imageUrl;
    private String thumbnail;
    private String description;

    public ProductDto(Long id, String productName, int quantity, String serialNumber, Double price, String category, String imageUrl, String thumbnail, String description) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.serialNumber = serialNumber;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
        this.thumbnail = thumbnail;
        this.description = description;
    }

    public ProductDto(Long id, String productName, int quantity, String serialNumber, Double price,
                      String category, String imageUrl, String description) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.serialNumber = serialNumber;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
        this.description = description;
    }
    public ProductDto(String productName, int quantity, String serialNumber, Double price,
                      String category, String imageUrl, String description) {
        this.productName = productName;
        this.quantity = quantity;
        this.serialNumber = serialNumber;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public ProductDto(String productName, int quantity, Double price,
                      String category, String imageUrl) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
    }

    public ProductDto(String productName, int quantity){
        this.productName = productName;
        this.quantity = quantity;
    }

    public ProductDto(String productName, String serialNumber){
        this.productName = productName;
        this.serialNumber = serialNumber;
    }

    public ProductDto(String productName){
        this.productName = productName;
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}