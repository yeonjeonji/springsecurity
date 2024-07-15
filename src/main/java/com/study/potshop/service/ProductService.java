package com.study.potshop.service;

import com.study.potshop.dto.ProductDto;
import com.study.potshop.dto.TestDto;
import com.study.potshop.entity.ProductEntity;
import com.study.potshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> allPdList () {
//
//        System.out.println("ProductService.allPdList");
//
//
        List<ProductEntity> productEntityList = productRepository.findAll();

//
//
//        System.out.println("productentitylist" + productEntityList);
//
        return productEntityList;

    }

//    public List<ProductDto> allPdList () {
//
//        System.out.println("ProductService.allPdList");
//
//
//        List<ProductEntity> productEntityList = productRepository.findAll();

        // 1번
//        List<ProductDto> toDto = productEntityList.stream().map(productEntity -> ProductDto.toDto(productEntity)).collect(Collectors.toList());


       // List<ProductDto> toDto = new ArrayList<>();

        // 2번 : 각 ProductEntity를 ProductDto로 변환하여 리스트에 추가
//        for (ProductEntity productEntity : productEntityList) {
//            ProductDto productDto = ProductDto.builder()
//                    .productNm(productEntity.getProductnm())
//                    .productId(productEntity.getProductid())
//                    .pdScript(productEntity.getPdscript())
//                    .price(productEntity.getPrice())
//                    .build();
//            toDto.add(productDto);
//        }
        // 3번
//        for (ProductEntity productEntity : productEntityList) {
//            ProductDto productDto = ProductDto.toDto(productEntity);
//            toDto.add(productDto);
//        }
//
//        return toDto;
//    }
//
}
