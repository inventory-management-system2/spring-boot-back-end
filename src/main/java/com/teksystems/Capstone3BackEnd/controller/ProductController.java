package com.teksystems.Capstone3BackEnd.controller;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;
import com.teksystems.Capstone3BackEnd.models.response.ProductResponse;
import com.teksystems.Capstone3BackEnd.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_RSS_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_RSS_XML_VALUE }
    )

    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(productRequest, productDto);

        ProductDto createdProduct = productService.createProduct(productDto);

        ProductResponse returnValue = new ProductResponse();
        BeanUtils.copyProperties(createdProduct, returnValue);
        return returnValue;
    }
//    @PutMapping("/{id}")
//    public ProductResponse updateProduct(@PathVariable String userId, @RequestBody ProductRequest productRequest){
//        ProductDto productDto = new ProductDto();
//        BeanUtils.copyProperties(productRequest, productDto);
//
//        ProductDto updatedProduct = productService.updateProduct(productId, productDto);
//
//        ProductResponse returnValue = new ProductResponse();
//        BeanUtils.copyProperties(updatedProduct, returnValue);
//        return returnValue;
//    }
}
