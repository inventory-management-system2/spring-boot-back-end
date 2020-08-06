package com.teksystems.Capstone3BackEnd.dto;

import java.util.Date;

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
    private int regionNe;
    private int regionSe;
    private int regionSw;


    public ProductDto() {
    }


    public ProductDto(Long id, String productName, String serialNumber) {
        this.id = id;
        this.productName = productName;
        this.serialNumber = serialNumber;
    }

    public ProductDto(long l, String james_franco, int i, String s, double v, String cool_actor, String s1, String s2, String cool, Date date, Date date1) {
    }

    public ProductDto(Long id, String productName, int quantity, Double price,  String serialNumber, String category, String imageUrl, String thumbnail, String description, int regionNe, int regionSe, int regionSw) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.serialNumber = serialNumber;
        this.category = category;
        this.imageUrl = imageUrl;
        this.thumbnail = thumbnail;
        this.description = description;
        this.regionNe = regionNe;
        this.regionSe = regionSe;
        this.regionSw = regionSw;
    }

    


	public ProductDto(String productName) {
		this.productName = productName;
	}


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


    public void setId(Long id) {
        this.id = id;
    }


    public int getRegionNe() {
        return regionNe;
    }


    public void setRegionNe(int regionNe) {
        this.regionNe = regionNe;
    }


    public int getRegionSe() {
        return regionSe;
    }


    public void setRegionSe(int regionSe) {
        this.regionSe = regionSe;
    }


    public int getRegionSw() {
        return regionSw;
    }


    public void setRegionSw(int regionSw) {
        this.regionSw = regionSw;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", description='" + description + '\'' +
                ", regionNe=" + regionNe +
                ", regionSe=" + regionSe +
                ", regionSw=" + regionSw +
                '}';
    }
}