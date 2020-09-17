package com.auth.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/*
 * mybaits 配置
 */
@Configuration
@MapperScan({"com.auth.demo.mbg.mapper","com.auth.demo.dao"})
public class MyBatisConfig {
}
