package com.teksystems.Capstone3BackEnd.service.implementations;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.controller.UpdateQuantity;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;
import com.teksystems.Capstone3BackEnd.repository.ProductRepository;
import com.teksystems.Capstone3BackEnd.service.ProductService;
import com.teksystems.Capstone3BackEnd.utils.Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {
	private final ProductRepository productRepository;
	private final Utils utils;

	public ProductServiceImplementation(ProductRepository productRepository, Utils utils) {
		this.productRepository = productRepository;
		this.utils = utils;
	}

	@Override
	public List<ProductDto> getAllUsers(int page, int limit){
		List<ProductEntity> productList = new ArrayList<ProductEntity>();
		if (page > 0) page --;
		Pageable pageRequest = PageRequest.of(page, limit);
		Page<ProductEntity> productPage = productRepository.findAll(pageRequest);
		productList = productPage.getContent();
		List<ProductDto> returnValue = new ArrayList<ProductDto>();
		for (ProductEntity eachProduct : productList){
			ProductDto productDto = new ProductDto();
			BeanUtils.copyProperties(eachProduct, productDto);
			returnValue.add(productDto);
		}
		return returnValue;
	}

	@Override
	public ProductDto updateProduct(String serialNumber, ProductDto productDto) {
		ProductEntity updatedProduct = productRepository.findBySerialNumber(serialNumber);
		ProductEntity oldProduct = new ProductEntity();
		BeanUtils.copyProperties(updatedProduct, oldProduct);
		System.out.println("------------------------------------------------------------------");
		System.out.println("OLD " + updatedProduct.getQuantity() + "  " + updatedProduct.getId() + "  " + updatedProduct.getProductName());
		System.out.println("------------------------------------------------------------------");

		BeanUtils.copyProperties(productDto, updatedProduct);

		System.out.println("NEW " + updatedProduct.getQuantity() + "  " + updatedProduct.getSerialNumber() + "  " + updatedProduct.getProductName() + "  " + updatedProduct.getPrice() + "  ");
		System.out.println("------------------------------------------------------------------");

		updatedProduct.setId(oldProduct.getId());
		updatedProduct.setSerialNumber(oldProduct.getSerialNumber());
		ProductEntity productEntity = productRepository.save(updatedProduct);
		System.out.println("------------------------------------------------------------------");
		System.out.println("SAVED " + productEntity.getQuantity() + "  " + productEntity.getId() + "  " + productEntity.getProductName() + "  " + productEntity.getPrice() + "  ");
		System.out.println("------------------------------------------------------------------");

		ProductDto returnValue = new ProductDto();
		BeanUtils.copyProperties(productEntity, returnValue);

		return returnValue;
	}

	@Override
	public ProductDto createProduct(ProductDto productDto) {
		if (productRepository.findByProductName(productDto.getProductName()) == null){
			String serialNumber = productDto.getSerialNumber();
			return updateProduct(serialNumber, productDto);
		}
		ProductEntity newProduct = new ProductEntity();
		BeanUtils.copyProperties(productDto, newProduct);

		newProduct.setSerialNumber(utils.generateSerialNumber(13));

		ProductEntity storedProduct = productRepository.save(newProduct);
		ProductDto returnValue = new ProductDto();
		BeanUtils.copyProperties(storedProduct, returnValue);
		System.out.println(returnValue);
		return returnValue;
	}


	@Override
	public ProductEntity updateQuantityProduct(String serialNumber, ProductRequest productRequestQty) {
		ProductEntity productEntity = productRepository.findBySerialNumber(serialNumber);
		if (productRequestQty.getQuantity() < 1) {
			return productEntity;
		}
		else {
			UpdateQuantity.getInstance().calculateQuantity(productRequestQty.getQuantity(), productEntity);
			ProductEntity updatedProduct = productRepository.save(productEntity);
			return updatedProduct;
		}

	}
}
