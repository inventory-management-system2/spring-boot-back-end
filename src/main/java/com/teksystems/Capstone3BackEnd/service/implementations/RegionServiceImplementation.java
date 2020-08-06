package com.teksystems.Capstone3BackEnd.service.implementations;


import com.teksystems.Capstone3BackEnd.models.RegionEntity;
import com.teksystems.Capstone3BackEnd.repository.RegionRepository;
import com.teksystems.Capstone3BackEnd.service.RegionService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegionServiceImplementation implements RegionService {
    private final RegionRepository regionRepository;

    public RegionServiceImplementation(RegionRepository regionRepository){
        this.regionRepository = regionRepository;
    }

    @Override
    public RegionEntity updateQuantity(RegionEntity region) {
        int updatedQuantity = region.getQuantity();
        Optional<RegionEntity> originalRegion = regionRepository.findById(region.getId());
		int total = originalRegion.get().getQuantity() + updatedQuantity;
        region.setQuantity(total);
		regionRepository.save(region);
        return region;
    }

}
