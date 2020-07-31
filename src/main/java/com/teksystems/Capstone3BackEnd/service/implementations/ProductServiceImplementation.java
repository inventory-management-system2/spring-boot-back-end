package com.teksystems.Capstone3BackEnd.service.implementations;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.repository.ProductRepository;
import com.teksystems.Capstone3BackEnd.service.ProductService;
import com.teksystems.Capstone3BackEnd.utils.Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplementation implements ProductService {
    private final ProductRepository productRepository;
    private final Utils utils;

    public ProductServiceImplementation(ProductRepository productRepository, Utils utils){
        this.productRepository = productRepository;
        this.utils = utils;
    }

    @Override
    public ProductDto updateProduct(String productId, ProductDto productDto){
        ProductEntity updatedProduct = productRepository.findByProductId(productId);
        BeanUtils.copyProperties(productDto, updatedProduct);
        ProductEntity productEntity = productRepository.save(updatedProduct);

        ProductDto returnValue = new ProductDto();
        BeanUtils.copyProperties(productEntity, returnValue);
        return returnValue;
    }

    @Override
    public ProductDto createProduct(ProductDto productDto){
        ProductEntity newProduct = new ProductEntity();
        BeanUtils.copyProperties(productDto, newProduct);

        newProduct.setProductId(utils.generateUserId(15));

        ProductEntity storedProduct = productRepository.save(newProduct);
        ProductDto returnValue = new ProductDto();
        BeanUtils.copyProperties(storedProduct, returnValue);
        return returnValue;
    }

//    @Override
//    public ProductDto getProduct(String productId){
//
//    }
}
