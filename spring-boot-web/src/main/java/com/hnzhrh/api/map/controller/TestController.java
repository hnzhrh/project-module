package com.hnzhrh.api.map.controller;

import com.hnzhrh.api.map.service.common.AdAccountService;
import com.hnzhrh.api.map.service.common.context.AdAccountContext;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private AdAccountContext adAccountContext;
    @RequestMapping("/ad")
    public void test(@Param("type")String type){
        final AdAccountService adAccountService = adAccountContext.getAdAccountService(type);
        adAccountService.print(type);
    }
}
