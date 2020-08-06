package com.teksystems.Capstone3BackEnd.service.implementations;


import com.teksystems.Capstone3BackEnd.models.RegionEntity;
import com.teksystems.Capstone3BackEnd.repository.ProductRepository;
import com.teksystems.Capstone3BackEnd.repository.RegionRepository;
import com.teksystems.Capstone3BackEnd.service.RegionService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegionServiceImplementation implements RegionService {
    private final RegionRepository regionRepository;
//    private final ProductRepository productRepository;

    public RegionServiceImplementation(RegionRepository regionRepository, ProductRepository productRepository){
        this.regionRepository = regionRepository;
//        this.productRepository = productRepository;

    }

    @Override
    public RegionEntity updateQuantity(RegionEntity region, String serialNumber) {
        int updatedQuantity = region.getQuantity();
        RegionEntity originalRegion = regionRepository.findByName(region.getRegionName());
		int total = originalRegion.getQuantity() + updatedQuantity;
        region.setQuantity(total);
		regionRepository.save(region);
        return region;
    }

}
