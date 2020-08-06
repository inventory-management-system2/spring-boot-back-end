package com.teksystems.Capstone3BackEnd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;
import com.teksystems.Capstone3BackEnd.repository.ProductRepository;
import com.teksystems.Capstone3BackEnd.service.implementations.ProductServiceImplementation;
import com.teksystems.Capstone3BackEnd.utils.Utils;

@SpringBootTest
public class ProductServiceImplementationTest {

    ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Test
    public void shouldCreateProduct() {


    }

    @Test
    public void shouldUpdateProduct() {

        // From dto Controller
        String serialNo = "Mu2Nq-iMACV-WBK";

        // From dto controller
        ProductDto dtoForUpdate = new ProductDto(263L, "James Franco", 0, "Mu2Nq-iMACV-WBK", 4.99, "cool actor",
                "asdfasdf.jpg", "james_franco_looking_cool.png", "cool", new Date(), new Date());



        // WHEN find by product name and find by serial number then return expectedEntity
        ProductEntity expectedEntity = new ProductEntity(263L, "James Franco", 0, "Mu2Nq-iMACV-WBK", 4.99, "actor",
                "asdfasdf.jpg", "james_franco_looking_cool.png", "cool", new Date(), new Date());

//        when(productRepository.findByProductName("James Franco")).thenReturn(expectedEntity);
        when(productRepository.findBySerialNumber("Mu2Nq-iMACV-WBK")).thenReturn(expectedEntity);

        ProductEntity expectedUpdate = new ProductEntity(263L, "James Franco", 1, "Mu2Nq-iMACV-WBK", 4.99, "cool actor",
                "asdfasdf.jpg", "james_franco_looking_cool.png", "cool", new Date(), new Date());

        when(productRepository.save(expectedEntity)).thenReturn(expectedUpdate);

        productService = new ProductServiceImplementation(productRepository, new Utils());


        ProductDto responseDto = productService.updateProduct(serialNo, dtoForUpdate);
        assertEquals("cool actor", responseDto.getCategory());

    }
    
    @Test 
    public void testCreateProduct() {
//    	ProductDto productDto = new ProductDto("Jelly Bean");
//    	ProductEntity productEntity = new ProductEntity(555L,"Jelly Bean");
//    	ProductEntity expectedEntity = new ProductEntity(555L,"Jelly Bean","serialNumber");
//    	when(productRepository.save(productEntity)).thenReturn(expectedEntity);
//    	productService = new ProductServiceImplementation(productRepository, new Utils());
//    	ProductDto actual = productService.createProduct(productDto);
//    	assertEquals("Jelly Bean", actual.getProductName());
    }
    
    @Test
    public void testUpdateQuantity() {
    	ProductRequest productRequestQty = new ProductRequest(50);
    	ProductEntity productEntity = new ProductEntity(263L, "James Franco", "Mu2Nq-iMACV-WBK",100);
    	when(productRepository.findBySerialNumber("Mu2Nq-iMACV-WBK")).thenReturn(productEntity);
    	when(productRepository.save(productEntity)).thenReturn(new ProductEntity(263L, "James Franco", "Mu2Nq-iMACV-WBK",150));
    	productService = new ProductServiceImplementation(productRepository, new Utils());
    	ProductEntity actual = productService.updateQuantityProduct("Mu2Nq-iMACV-WBK", productRequestQty);
    	assertEquals(150,actual.getRegionNe());
    	
    	
    }
    
    @Test
    public void testGetProduct() {
    	ProductEntity productEntity = new ProductEntity(263L, "James Franco", "Mu2Nq-iMACV-WBK",100);
    	when(productRepository.findBySerialNumber("Mu2Nq-iMACV-WBK")).thenReturn(productEntity);
    	productService = new ProductServiceImplementation(productRepository, new Utils());
    	ProductDto actualDto = productService.getProduct("Mu2Nq-iMACV-WBK");
    	assertEquals("James Franco", actualDto.getProductName());
    	assertEquals(263L, actualDto.getId());
    	
    	
    }
    


}





















