package com.teksystems.Capstone3BackEnd.models.request;

public class ProductRequest {
    private String productName;
    private int quantity;
    private Double price;
    private String category;
    private String imageUrl;
    private String thumbnail;
    private String description;
    private int regionNe; 
    private int regionSe; 
    private int regionSw; 

   

    

    public ProductRequest(String productName, int quantity, Double price, String category, String imageUrl,
			String thumbnail, String description, int regionNe, int regionSe, int regionSw) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
		this.imageUrl = imageUrl;
		this.thumbnail = thumbnail;
		this.description = description;
		this.regionNe = regionNe; 
		this.regionSe = regionSe;
		this.regionSw = regionSw; 
	}

	public ProductRequest(){}

    public ProductRequest(String productName) {
        this.productName = productName;
    }

    

	public ProductRequest(int regionNe) {
		this.regionNe = regionNe;
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

	public void setRegionSW(int regionSw) {
		this.regionSw = regionSw;
	}
    
	

}