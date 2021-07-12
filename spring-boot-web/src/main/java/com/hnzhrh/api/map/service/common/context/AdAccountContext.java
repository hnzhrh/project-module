package com.hnzhrh.api.map.service.common.context;

import com.hnzhrh.api.map.service.common.AdAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AdAccountContext {
    @Autowired
    Map<String, AdAccountService> adAccountServiceMap;
    public AdAccountService getAdAccountService(String type){
        return adAccountServiceMap.get(type);
    }
}
