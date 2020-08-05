package com.teksystems.Capstone3BackEnd.controller;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;
import com.teksystems.Capstone3BackEnd.models.response.ProductResponse;
import com.teksystems.Capstone3BackEnd.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("products")
<<<<<<< HEAD

@CrossOrigin(origins="http://64.227.88.54:3000")

=======
@CrossOrigin(origins="http://localhost:3000")
>>>>>>> 6a60c7542bcf729601b6163e23564a41e575f37d
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

    @PutMapping("/{serialNumber}")
    public ProductResponse updateProduct(@PathVariable String serialNumber, @RequestBody ProductRequest productRequest){
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(productRequest, productDto);

        ProductDto updatedProduct = productService.updateProduct(serialNumber, productDto);

        ProductResponse returnValue = new ProductResponse();
        BeanUtils.copyProperties(updatedProduct, returnValue);
        return returnValue;
    }
    
    @PutMapping("/quantity/{serialNumber}")
    public ProductResponse updateQuantity(@PathVariable String serialNumber, @RequestBody ProductRequest productRequestQty) {
    	ProductEntity productEntity = productService.updateQuantityProduct(serialNumber, productRequestQty); 
    	
    	ProductResponse returnValue = new ProductResponse();
    	BeanUtils.copyProperties(productEntity, returnValue);
    	return returnValue; 
    }

    @GetMapping
    public List<ProductResponse> getAllProducts(@RequestParam(value="page", defaultValue = "1") int page, @RequestParam(value="limit", defaultValue = "20") int limit){
        List<ProductDto> productList = productService.getAllProducts(page, limit);
        List<ProductResponse> returnValue = new ArrayList<ProductResponse>();
        for (ProductDto eachProduct : productList){
            ProductResponse productResponse = new ProductResponse();
            BeanUtils.copyProperties(eachProduct, productResponse);
            returnValue.add(productResponse);
        }
        return returnValue;
    }

    @GetMapping("/{serialNumber}")
    public ProductResponse getProduct(@PathVariable String serialNumber){
        ProductDto productDto = productService.getProduct(serialNumber);
        ProductResponse productResponse = new ProductResponse();
        BeanUtils.copyProperties(productDto, productResponse);
        return productResponse;
    }

}







