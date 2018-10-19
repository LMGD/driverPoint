package com.congtuo.driverPort.mapper;

import com.congtuo.driverPort.model.driverLoginInfo;

public interface driverLoginInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(driverLoginInfo record);

    int insertSelective(driverLoginInfo record);

    driverLoginInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(driverLoginInfo record);

    int updateByPrimaryKey(driverLoginInfo record);
}