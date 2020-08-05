package com.teksystems.Capstone3BackEnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teksystems.Capstone3BackEnd.controller.UpdateQuantity;
import com.teksystems.Capstone3BackEnd.models.RegionEntity;
import com.teksystems.Capstone3BackEnd.repository.RegionRepository;

@Service
public class RegionService {
	@Autowired
	private RegionRepository regionRepository;

	public RegionEntity findById(Long id) {
		RegionEntity region = regionRepository.findById(id).get();
		
		return region;
	}
	
	public RegionEntity updateQuantity(RegionEntity regionEntity) {
		RegionEntity region = findById(regionEntity.getId());
		RegionEntity updatedQuantity = UpdateQuantity.getInstance().calculateQuantity(regionEntity.getQuantity(), region);
		return updatedQuantity;
	}
	

	
	

}
