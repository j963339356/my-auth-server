package com.auth.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/*
 * mybaits 配置
 */
@Configuration
@MapperScan({"com.auth.mbg.mapper","com.auth.module_*.dao"})
public class MyBatisConfig {
}
