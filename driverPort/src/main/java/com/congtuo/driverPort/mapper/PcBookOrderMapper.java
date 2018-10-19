package com.congtuo.driverPort.mapper;

import com.congtuo.driverPort.model.PcBookOrder;
import com.congtuo.driverPort.model.PcBookOrderKey;
import com.congtuo.driverPort.model.PcBookOrderWithBLOBs;

public interface PcBookOrderMapper {
    int deleteByPrimaryKey(PcBookOrderKey key);

    int insert(PcBookOrderWithBLOBs record);

    int insertSelective(PcBookOrderWithBLOBs record);

    PcBookOrderWithBLOBs selectByPrimaryKey(PcBookOrderKey key);

    int updateByPrimaryKeySelective(PcBookOrderWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PcBookOrderWithBLOBs record);

    int updateByPrimaryKey(PcBookOrder record);
}