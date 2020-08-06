package com.teksystems.Capstone3BackEnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teksystems.Capstone3BackEnd.models.RegionEntity;

@Repository
public interface RegionRepository extends CrudRepository<RegionEntity,String>{

	RegionEntity findByRegionName(String regionName);

}
