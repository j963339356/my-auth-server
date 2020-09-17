package com.auth.demo.mbg.mapper;

import com.auth.demo.mbg.model.MapUserrole;
import com.auth.demo.mbg.model.MapUserroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MapUserroleMapper {
    long countByExample(MapUserroleExample example);

    int deleteByExample(MapUserroleExample example);

    int deleteByPrimaryKey(String id);

    int insert(MapUserrole record);

    int insertSelective(MapUserrole record);

    List<MapUserrole> selectByExample(MapUserroleExample example);

    MapUserrole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MapUserrole record, @Param("example") MapUserroleExample example);

    int updateByExample(@Param("record") MapUserrole record, @Param("example") MapUserroleExample example);

    int updateByPrimaryKeySelective(MapUserrole record);

    int updateByPrimaryKey(MapUserrole record);
}