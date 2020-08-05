package com.teksystems.Capstone3BackEnd.models.request;

public class ProductRequest {
    private String productName;
    private int quantity;
    private Double price;
    private String category;
    private String imageUrl;
    private String thumbnail;
    private String description;
    private String regionNE; 
    private String regionSE; 
    private String regionSW; 

   

    

    public ProductRequest(String productName, int quantity, Double price, String category, String imageUrl,
			String thumbnail, String description, String regionNE, String regionSE, String regionSW) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
		this.imageUrl = imageUrl;
		this.thumbnail = thumbnail;
		this.description = description;
		this.regionNE = regionNE; 
		this.regionSE = regionSE;
		this.regionSW = regionSW; 
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

	public String getRegionNE() {
		return regionNE;
	}

	public void setRegionNE(String regionNE) {
		this.regionNE = regionNE;
	}

	public String getRegionSE() {
		return regionSE;
	}

	public void setRegionSE(String regionSE) {
		this.regionSE = regionSE;
	}

	public String getRegionSW() {
		return regionSW;
	}

	public void setRegionSW(String regionSW) {
		this.regionSW = regionSW;
	}
    
	

}