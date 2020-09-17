package com.auth.demo.mbg.mapper;

import com.auth.demo.mbg.model.MapRoleresource;
import com.auth.demo.mbg.model.MapRoleresourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MapRoleresourceMapper {
    long countByExample(MapRoleresourceExample example);

    int deleteByExample(MapRoleresourceExample example);

    int deleteByPrimaryKey(String id);

    int insert(MapRoleresource record);

    int insertSelective(MapRoleresource record);

    List<MapRoleresource> selectByExample(MapRoleresourceExample example);

    MapRoleresource selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MapRoleresource record, @Param("example") MapRoleresourceExample example);

    int updateByExample(@Param("record") MapRoleresource record, @Param("example") MapRoleresourceExample example);

    int updateByPrimaryKeySelective(MapRoleresource record);

    int updateByPrimaryKey(MapRoleresource record);
}