package com.hnzhrh.pojo.domain;

import lombok.Data;

@Data
public class ProductDO {
    private String prodId;
    private Long vendId;
    private String prodName;
    private Double prodPrice;
    private String prodDesc;
}
