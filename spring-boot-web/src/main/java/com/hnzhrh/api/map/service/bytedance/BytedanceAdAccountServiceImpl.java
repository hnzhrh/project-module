package com.hnzhrh.api.map.service.bytedance;

import com.hnzhrh.api.map.service.common.AdAccountService;
import org.springframework.stereotype.Service;

@Service("bytedance")
public class BytedanceAdAccountServiceImpl implements AdAccountService {
    @Override
    public void print(String type) {
        System.out.println("字节跳动账号实现类");
    }
}
