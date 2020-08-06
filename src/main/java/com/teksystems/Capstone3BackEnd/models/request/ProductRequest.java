package com.teksystems.Capstone3BackEnd.models.request;

import com.teksystems.Capstone3BackEnd.models.RegionEntity;

import java.util.ArrayList;
import java.util.List;

public class ProductRequest {
    private String productName;
    private Double price;
    private String category;
    private String imageUrl;
    private String thumbnail;
    private String description;
//    private List<RegionEntity> regions;

    public ProductRequest(String productName, Double price, String category, String imageUrl,
                          String thumbnail, String description) {
		this.productName = productName;

		this.price = price;
		this.category = category;
		this.imageUrl = imageUrl;
		this.thumbnail = thumbnail;
		this.description = description;
//        List<RegionEntity> regions = new ArrayList<RegionEntity>();
//        this.regions.add(region);
	}

	public ProductRequest(){}

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

//    public List<RegionEntity> getRegions() {
//        return regions;
//    }
//    public void setRegion(RegionEntity region) {
//        this.regions.add(region);
//    }

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