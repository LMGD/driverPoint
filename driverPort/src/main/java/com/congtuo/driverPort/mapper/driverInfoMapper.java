package com.congtuo.driverPort.mapper;

import com.congtuo.driverPort.model.driverInfo;

public interface driverInfoMapper {
    int deleteByPrimaryKey(Integer driverId);

    int insert(driverInfo record);

    int insertSelective(driverInfo record);

    driverInfo selectByPrimaryKey(Integer driverId);

    int updateByPrimaryKeySelective(driverInfo record);

    int updateByPrimaryKey(driverInfo record);

    //登入

}