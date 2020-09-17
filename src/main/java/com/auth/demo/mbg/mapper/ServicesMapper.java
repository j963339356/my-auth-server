package com.auth.demo.mbg.mapper;

import com.auth.demo.mbg.model.Services;
import com.auth.demo.mbg.model.ServicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicesMapper {
    long countByExample(ServicesExample example);

    int deleteByExample(ServicesExample example);

    int deleteByPrimaryKey(String id);

    int insert(Services record);

    int insertSelective(Services record);

    List<Services> selectByExample(ServicesExample example);

    Services selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Services record, @Param("example") ServicesExample example);

    int updateByExample(@Param("record") Services record, @Param("example") ServicesExample example);

    int updateByPrimaryKeySelective(Services record);

    int updateByPrimaryKey(Services record);
}