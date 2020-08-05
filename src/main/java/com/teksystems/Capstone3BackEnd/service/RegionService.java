package com.teksystems.Capstone3BackEnd.service;

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

	public RegionEntity findById(Long id) {
		RegionEntity region = regionRepository.findById(id).get();
		return region;
	}
	
	public RegionEntity updateQuantity(ProductDto productDto, RegionEntity regionEntity) {
		ProductEntity product = productRepository.findBySerialNumber(productDto.getSerialNumber());
		for(RegionEntity region : product.getRegions()){
			if(region.equals(regionEntity)) {
				region = UpdateQuantity.getInstance().calculateQuantity(region.getQuantity(),regionEntity);
				return regionRepository.save(region);
			}
		}
		product.getRegions().add(regionEntity);
		
		
		return regionEntity;
	}

	public Iterable<RegionEntity> findAll() {
		Iterable<RegionEntity> regionEntity = regionRepository.findAll();
		return regionEntity;
	}
	

	
	

}
