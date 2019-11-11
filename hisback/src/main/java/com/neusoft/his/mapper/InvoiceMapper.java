package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Invoice;
@Mapper
public interface InvoiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Invoice record);

    int insertSelective(Invoice record);

    Invoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Invoice record);

    int updateByPrimaryKey(Invoice record);
}