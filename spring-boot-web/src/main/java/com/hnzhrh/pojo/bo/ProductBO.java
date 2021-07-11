package com.hnzhrh.pojo.bo;

import lombok.Data;

@Data
public class ProductBO {
    private String prodId;
    private long vendId;
    private String prodName;
    private double prodPrice;
    private String prodDesc;
}
