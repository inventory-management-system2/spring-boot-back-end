package com.teksystems.Capstone3BackEnd.service;

import com.teksystems.Capstone3BackEnd.models.RegionEntity;

public interface RegionService {
    RegionEntity updateQuantity(RegionEntity regionEntity, String serialNumber);
}
