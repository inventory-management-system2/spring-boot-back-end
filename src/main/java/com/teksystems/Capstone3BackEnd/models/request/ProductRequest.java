package com.teksystems.Capstone3BackEnd.models.request;

public class ProductRequest {
    private String productName;
    private int quantity;
    private Double price;
    private String category;
    private String imageUrl;
    private String thumbnail;
    private String description;

   

    

    public ProductRequest(String productName, int quantity, Double price, String category, String imageUrl,
			String thumbnail, String description) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
		this.imageUrl = imageUrl;
		this.thumbnail = thumbnail;
		this.description = description;
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
    

}