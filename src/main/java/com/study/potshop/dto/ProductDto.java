package com.study.potshop.dto;

import com.study.potshop.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private int productId;
    private String productNm;
    private int price;
    private String pdScript;

    public static ProductDto toDto(ProductEntity productEntity) {

//        ProductDto productDto = new ProductDto();
//        productDto.setProductId(productEntity.getProductid());
//        productDto.setProductNm(productEntity.getProductnm());
//        productDto.setPdScript(productEntity.getPdscript());
//        productDto.setPrice(productEntity.getPrice());

        ProductDto productDto = ProductDto.builder()
                .price(productEntity.getPrice())
                .productId(productEntity.getProductid())
                .pdScript(productEntity.getPdscript())
                .price(productEntity.getPrice())
                .build();

        return productDto;
    }
}
