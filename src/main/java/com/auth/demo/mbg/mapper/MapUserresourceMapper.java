package com.auth.demo.mbg.mapper;

import com.auth.demo.mbg.model.MapUserresource;
import com.auth.demo.mbg.model.MapUserresourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MapUserresourceMapper {
    long countByExample(MapUserresourceExample example);

    int deleteByExample(MapUserresourceExample example);

    int deleteByPrimaryKey(String id);

    int insert(MapUserresource record);

    int insertSelective(MapUserresource record);

    List<MapUserresource> selectByExample(MapUserresourceExample example);

    MapUserresource selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MapUserresource record, @Param("example") MapUserresourceExample example);

    int updateByExample(@Param("record") MapUserresource record, @Param("example") MapUserresourceExample example);

    int updateByPrimaryKeySelective(MapUserresource record);

    int updateByPrimaryKey(MapUserresource record);
}