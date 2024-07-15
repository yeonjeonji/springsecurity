package com.study.potshop.controller;

import com.study.potshop.dto.ProductDto;
import com.study.potshop.dto.TestDto;
import com.study.potshop.entity.ProductEntity;
import com.study.potshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getlist")
    public List<ProductEntity> allPdList (){


        System.out.println("ProductController.allPdList");
        List<ProductEntity> productEntityList = productService.allPdList();
//        res.getProductNm();
//        res.getProductId();
//        res.getPrice();
//        res.getPdScript();

        return productEntityList;
    }

//    @GetMapping("/getlist")
//    public List<ProductDto> allPdList (){
//
//
//        System.out.println("ProductController.allPdList");
//        List<ProductDto> productEntityList = productService.allPdList();
//        res.getProductNm();
//        res.getProductId();
//        res.getPrice();
//        res.getPdScript();

       // return productEntityList;
    //}

}
