package com.teksystems.Capstone3BackEnd.service;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplementation implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository){
        this.productRepository = productRepository;

    }

//    @Override
//    public ProductDto updatedProduct(String productId, ProductDto productDto){
//        ProductEntity updatedProduct = productRepository.findByUserId(productId);
//    }

    @Override
    public ProductDto createProduct(ProductDto productDto){
        ProductEntity newProduct = new ProductEntity();
        BeanUtils.copyProperties(productDto, newProduct);

//        newProduct.setProductId(utils.generateUserId(15));

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
