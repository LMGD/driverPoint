package com.congtuo.driverPort.mapper;

import com.congtuo.driverPort.model.jsjOrder;
import com.congtuo.driverPort.model.jsjOrderWithBLOBs;

public interface jsjOrderMapper {
    int deleteByPrimaryKey(String orderCode);

    int insert(jsjOrderWithBLOBs record);

    int insertSelective(jsjOrderWithBLOBs record);

    jsjOrderWithBLOBs selectByPrimaryKey(String orderCode);

    int updateByPrimaryKeySelective(jsjOrderWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(jsjOrderWithBLOBs record);

    int updateByPrimaryKey(jsjOrder record);
}