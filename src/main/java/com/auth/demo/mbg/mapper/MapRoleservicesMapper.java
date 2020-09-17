package com.auth.demo.mbg.mapper;

import com.auth.demo.mbg.model.MapRoleservices;
import com.auth.demo.mbg.model.MapRoleservicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MapRoleservicesMapper {
    long countByExample(MapRoleservicesExample example);

    int deleteByExample(MapRoleservicesExample example);

    int deleteByPrimaryKey(String id);

    int insert(MapRoleservices record);

    int insertSelective(MapRoleservices record);

    List<MapRoleservices> selectByExample(MapRoleservicesExample example);

    MapRoleservices selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MapRoleservices record, @Param("example") MapRoleservicesExample example);

    int updateByExample(@Param("record") MapRoleservices record, @Param("example") MapRoleservicesExample example);

    int updateByPrimaryKeySelective(MapRoleservices record);

    int updateByPrimaryKey(MapRoleservices record);
}