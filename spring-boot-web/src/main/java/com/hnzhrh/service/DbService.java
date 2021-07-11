package com.hnzhrh.service;

import com.hnzhrh.pojo.bo.ProductBO;

import java.util.List;

public interface DbService {
    List<ProductBO> queryProductAll();
}
