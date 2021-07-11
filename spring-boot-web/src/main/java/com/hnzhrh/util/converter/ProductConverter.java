package com.hnzhrh.util.converter;

import com.hnzhrh.pojo.bo.ProductBO;
import com.hnzhrh.pojo.domain.ProductDO;
import com.hnzhrh.pojo.vo.ProductVO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductConverter {
    ProductBO doToBo(ProductDO productDO);
    ProductVO boToVo(ProductBO productBO);
}
