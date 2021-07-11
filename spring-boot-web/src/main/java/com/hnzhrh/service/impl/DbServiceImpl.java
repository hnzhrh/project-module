package com.hnzhrh.service.impl;

import com.hnzhrh.dao.ProductMapper;
import com.hnzhrh.pojo.bo.ProductBO;
import com.hnzhrh.pojo.domain.ProductDO;
import com.hnzhrh.service.DbService;
import com.hnzhrh.util.converter.ProductConverter;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DbServiceImpl implements DbService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductConverter productConverter;
    @Override
    public List<ProductBO> queryProductAll() {
        List<ProductDO> productDOS = productMapper.queryProductAll();
        // 转换成BO
        List<ProductBO> productBOS = new ArrayList<>();
        for(ProductDO productDO : productDOS){
            productBOS.add(productConverter.doToBo(productDO));
        }
        return productBOS;
    }
}
