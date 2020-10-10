package com.auth.mbg.mapper;

import com.auth.mbg.model.UmsService;
import com.auth.mbg.model.UmsServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsServiceMapper {
    long countByExample(UmsServiceExample example);

    int deleteByExample(UmsServiceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsService record);

    int insertSelective(UmsService record);

    List<UmsService> selectByExample(UmsServiceExample example);

    UmsService selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsService record, @Param("example") UmsServiceExample example);

    int updateByExample(@Param("record") UmsService record, @Param("example") UmsServiceExample example);

    int updateByPrimaryKeySelective(UmsService record);

    int updateByPrimaryKey(UmsService record);
}