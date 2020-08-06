package com.teksystems.Capstone3BackEnd.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teksystems.Capstone3BackEnd.controller.UpdateQuantity;
import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.models.RegionEntity;
import com.teksystems.Capstone3BackEnd.repository.ProductRepository;
import com.teksystems.Capstone3BackEnd.repository.RegionRepository;

@Service
public class RegionService {
	@Autowired
	private RegionRepository regionRepository;
	@Autowired
	private ProductRepository productRepository;

	
	public ProductEntity updateQuantity(ProductEntity productEntity, RegionEntity regionEntity) {
		RegionEntity regionEnti = regionRepository.findByRegionName(regionEntity.getRegionName());
		System.out.println("updateQuantity metho service"+ regionEnti.toString());
		System.out.println("updateQuantity metho service"+ productEntity.toString());
		
		for(int x = 0; x<productEntity.getRegions().size(); x++){
			System.out.println("inside for"+productEntity.getRegions().get(x).toString());
			if(productEntity.getRegions().contains(regionEntity)) {
			RegionEntity region = UpdateQuantity.getInstance().calculateQuantity(productEntity.getRegions().get(x).getQuantity(),regionEnti);
				
				productEntity.getRegions().add(region);
				productRepository.save(productEntity);
				return productEntity;				
			}			
		}
		
		RegionEntity region = UpdateQuantity.getInstance().calculateQuantity(regionEntity.getQuantity(),regionEnti);
		region.setProduct(productEntity);
		System.out.println("updateQuantity metho adding the quantity"+ region.toString());
		regionRepository.save(region);
		productEntity.getRegions().add(regionEnti);
		System.out.println("updateQuantity metho "+ productEntity.toString());
		 productRepository.save(productEntity);
		 System.out.println("After Saving "+ productEntity.toString());
		 
		
		return productEntity;
	}

	public Iterable<RegionEntity> findAll() {
		Iterable<RegionEntity> regionEntity = regionRepository.findAll();
		return regionEntity;
	}
	

	
	

}
