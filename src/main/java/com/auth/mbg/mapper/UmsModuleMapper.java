package com.auth.mbg.mapper;

import com.auth.mbg.model.UmsModule;
import com.auth.mbg.model.UmsModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsModuleMapper {
    long countByExample(UmsModuleExample example);

    int deleteByExample(UmsModuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsModule record);

    int insertSelective(UmsModule record);

    List<UmsModule> selectByExample(UmsModuleExample example);

    UmsModule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsModule record, @Param("example") UmsModuleExample example);

    int updateByExample(@Param("record") UmsModule record, @Param("example") UmsModuleExample example);

    int updateByPrimaryKeySelective(UmsModule record);

    int updateByPrimaryKey(UmsModule record);
}