package com.congtuo.driverPort.mapper;

import com.congtuo.driverPort.model.bcOrder;
import com.congtuo.driverPort.model.bcOrderWithBLOBs;

public interface bcOrderMapper {
    int deleteByPrimaryKey(String orderCode);

    int insert(bcOrderWithBLOBs record);

    int insertSelective(bcOrderWithBLOBs record);

    bcOrderWithBLOBs selectByPrimaryKey(String orderCode);

    int updateByPrimaryKeySelective(bcOrderWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(bcOrderWithBLOBs record);

    int updateByPrimaryKey(bcOrder record);
}