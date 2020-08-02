package com.teksystems.Capstone3BackEnd.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;
import com.teksystems.Capstone3BackEnd.models.response.ProductResponse;
import com.teksystems.Capstone3BackEnd.service.ProductService;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/")
    public ModelAndView display(@ModelAttribute("product") ProductRequest productRequest) {
    	return new ModelAndView("index");
    }
    @PostMapping( "/product")
    public ModelAndView createProduct(@ModelAttribute("product") ProductRequest productRequest,BindingResult result){
    	
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(productRequest, productDto);

        ProductDto createdProduct = productService.createProduct(productDto);

        ProductResponse returnValue = new ProductResponse();
        BeanUtils.copyProperties(createdProduct, returnValue);
        return new ModelAndView("index");
    }

    @PutMapping("/{id}")
    public ProductResponse updateProduct(@PathVariable String productId, @RequestBody ProductRequest productRequest){
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(productRequest, productDto);

        ProductDto updatedProduct = productService.updateProduct(productId, productDto);

        ProductResponse returnValue = new ProductResponse();
        BeanUtils.copyProperties(updatedProduct, returnValue);
        return returnValue;
    }

    @PutMapping("/quantity/{productId}")
    public ProductResponse updateQuantity(@PathVariable String productId, @RequestBody ProductRequest productRequestQty) {
    	
    	ProductEntity productEntity = productService.updateQuantityProduct(productId, productRequestQty); 
    	
    	ProductResponse returnValue = new ProductResponse();
    	BeanUtils.copyProperties(productEntity, returnValue);
    	return returnValue; 
    }


}







