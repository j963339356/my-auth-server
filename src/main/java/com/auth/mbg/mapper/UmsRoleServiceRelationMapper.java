package com.auth.mbg.mapper;

import com.auth.mbg.model.UmsRoleServiceRelation;
import com.auth.mbg.model.UmsRoleServiceRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleServiceRelationMapper {
    long countByExample(UmsRoleServiceRelationExample example);

    int deleteByExample(UmsRoleServiceRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsRoleServiceRelation record);

    int insertSelective(UmsRoleServiceRelation record);

    List<UmsRoleServiceRelation> selectByExample(UmsRoleServiceRelationExample example);

    UmsRoleServiceRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsRoleServiceRelation record, @Param("example") UmsRoleServiceRelationExample example);

    int updateByExample(@Param("record") UmsRoleServiceRelation record, @Param("example") UmsRoleServiceRelationExample example);

    int updateByPrimaryKeySelective(UmsRoleServiceRelation record);

    int updateByPrimaryKey(UmsRoleServiceRelation record);
}