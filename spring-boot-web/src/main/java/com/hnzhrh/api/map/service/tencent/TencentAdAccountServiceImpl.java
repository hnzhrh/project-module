package com.hnzhrh.api.map.service.tencent;

import com.hnzhrh.api.map.service.common.AdAccountService;
import org.springframework.stereotype.Service;

@Service("tencent")
public class TencentAdAccountServiceImpl implements AdAccountService {
    @Override
    public void print(String type) {
        System.out.println("腾讯账号实现类");
    }
}
