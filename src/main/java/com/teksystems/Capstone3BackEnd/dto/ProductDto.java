package com.teksystems.Capstone3BackEnd.dto;

import java.util.List;

import com.teksystems.Capstone3BackEnd.models.RegionEntity;

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
    private List<RegionEntity> regions;


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


	public void setId(Long id) {
		this.id = id;
	}


	public List<RegionEntity> getRegions() {
		return regions;
	}


	public void setRegions(List<RegionEntity> regions) {
		this.regions = regions;
	}


	
	
    
}