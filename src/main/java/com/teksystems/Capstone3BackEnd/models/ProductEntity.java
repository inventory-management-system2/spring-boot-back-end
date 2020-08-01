package com.teksystems.Capstone3BackEnd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String productName;
	private int quantity;
	private String serialNumber;
	private Double price;
	private String category;
	private String imageUrl;
	
	public ProductEntity(String productName, int quantity, String serialNumber, Double price,
			String category, String imageUrl) {
		this.productName = productName;
		this.quantity = quantity;
		this.serialNumber = serialNumber;
		this.price = price;
		this.category = category;
		this.imageUrl = imageUrl;
	}

	public ProductEntity(){}

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




//package com.teksystems.Capstone3BackEnd.models;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.PrePersist;
//import javax.persistence.PreUpdate;
//import javax.persistence.Table;
//
//import org.springframework.format.annotation.DateTimeFormat;
//
//@Entity
//@Table(name = "products")
//public class ProductEntity {
//	@Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private String productId;
//	private String name;
//	private int quantity;
//	@Column(updatable=false)
//    @DateTimeFormat(pattern="yyyy-mm-dd")
//    private Date createdAt;
//    private Date updatedAt;
//
//	public ProductEntity() {
//
//	}
//
//	public ProductEntity(String name, Integer quantity) {
//		this.name = name;
//		this.quantity = quantity;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Integer getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(Integer quantity) {
//		this.quantity = quantity;
//	}
//
//	@PrePersist
//    protected void onCreate(){
//        this.createdAt = new Date();
//    }
//    @PreUpdate
//    protected void onUpdate(){
//        this.updatedAt = new Date();
//    }
//
//
//}
