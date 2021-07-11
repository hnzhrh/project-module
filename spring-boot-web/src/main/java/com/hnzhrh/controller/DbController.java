package com.hnzhrh.controller;

import com.hnzhrh.pojo.bo.ProductBO;
import com.hnzhrh.pojo.vo.ProductVO;
import com.hnzhrh.service.DbService;
import com.hnzhrh.util.converter.ProductConverter;
import com.hnzhrh.util.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/db")
public class DbController {
    @Autowired
    private DbService dbService;
    @Autowired
    private ProductConverter productConverter;
    // 查询产品表
    @RequestMapping("/queryProductAll")
    public Result<List<ProductVO>> queryProductAll(){
        final List<ProductBO> productBOS = dbService.queryProductAll();
        // 转化成VO
        List<ProductVO> productVOS = new ArrayList<>();
        for(ProductBO productBO : productBOS){
            productVOS.add(productConverter.boToVo(productBO));
        }
        return Result.success(productVOS);
    }
}
