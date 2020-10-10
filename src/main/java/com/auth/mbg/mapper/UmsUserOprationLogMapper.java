package com.auth.mbg.mapper;

import com.auth.mbg.model.UmsUserOprationLog;
import com.auth.mbg.model.UmsUserOprationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsUserOprationLogMapper {
    long countByExample(UmsUserOprationLogExample example);

    int deleteByExample(UmsUserOprationLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsUserOprationLog record);

    int insertSelective(UmsUserOprationLog record);

    List<UmsUserOprationLog> selectByExample(UmsUserOprationLogExample example);

    UmsUserOprationLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsUserOprationLog record, @Param("example") UmsUserOprationLogExample example);

    int updateByExample(@Param("record") UmsUserOprationLog record, @Param("example") UmsUserOprationLogExample example);

    int updateByPrimaryKeySelective(UmsUserOprationLog record);

    int updateByPrimaryKey(UmsUserOprationLog record);
}