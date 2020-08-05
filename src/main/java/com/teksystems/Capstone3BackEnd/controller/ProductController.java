package com.teksystems.Capstone3BackEnd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.RegionEntity;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;
import com.teksystems.Capstone3BackEnd.models.response.ProductResponse;
import com.teksystems.Capstone3BackEnd.service.ProductService;
import com.teksystems.Capstone3BackEnd.service.RegionService;

@RestController
@RequestMapping("products")
@CrossOrigin(origins="http://localhost:3000")
public class ProductController {
	
	@Autowired
	private RegionService regionService;
	
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
    @GetMapping("/quantity/{serialNumber")
    public Iterable<RegionEntity> getAllRegions(@PathVariable String serialNumber) {
    	Iterable<RegionEntity> regionEntity = regionService.findAll();
    	return regionEntity;
    	
    }
    @PutMapping("/quantity/{serialNumber}")
    public RegionEntity updateQuantity(@PathVariable String serialNumber, @RequestBody RegionEntity regionEntity) {
    	ProductDto productDto = productService.getProduct(serialNumber);
    	RegionEntity region = regionService.updateQuantity(productDto,regionEntity);
    	return region; 
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







