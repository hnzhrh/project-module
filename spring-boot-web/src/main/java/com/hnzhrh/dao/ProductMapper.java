package com.hnzhrh.dao;

import com.hnzhrh.pojo.domain.ProductDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ProductMapper {
    List<ProductDO> queryProductAll();
}
