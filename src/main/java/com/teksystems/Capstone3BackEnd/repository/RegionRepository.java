package com.teksystems.Capstone3BackEnd.repository;

import com.teksystems.Capstone3BackEnd.models.RegionEntity;
import com.teksystems.Capstone3BackEnd.service.RegionService;
import org.springframework.data.repository.CrudRepository;

public interface RegionRepository extends CrudRepository<RegionEntity, Long> {

}
