package com.congtuo.driverPort.mapper;

import com.congtuo.driverPort.model.JsjReassignRecord;

public interface JsjReassignRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JsjReassignRecord record);

    int insertSelective(JsjReassignRecord record);

    JsjReassignRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JsjReassignRecord record);

    int updateByPrimaryKey(JsjReassignRecord record);
}