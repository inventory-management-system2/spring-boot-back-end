package com.teksystems.Capstone3BackEnd.models.response;

public class ProductResponse {
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


    public ProductResponse(){}

    public ProductResponse(String productName, String serialNumber) {
        this.productName = productName;
        this.serialNumber = serialNumber;
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
    
    
}