package com.fahoud.skeleton.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Fahoud
 * Date: 2020/7/11
 * Time: 11:11
 * Description:mybatis配置类
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.example.mall.mbg.mapper","com.example.mall.dao"})
public class MyBatisConfig {
}
