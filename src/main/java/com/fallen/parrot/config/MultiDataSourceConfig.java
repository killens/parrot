package com.fallen.parrot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class MultiDataSourceConfig {

//    @Primary
    @Bean(name = "master")
    @ConfigurationProperties(prefix = "spring.datasource.druid.master")
    public DataSource dataSourceMaster(){
        return new DruidDataSource();
    }

    @Bean(name = "slave1")
    @ConfigurationProperties(prefix = "spring.datasource.druid.slave1")
    public DataSource dataSourceSlave1(){
        return new DruidDataSource();
    }

    @Bean
    @Primary
    public DataSource dynamicDataSource(@Qualifier("master") DataSource master, @Qualifier("slave1") DataSource slave1){
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //设置默认数据源
        dynamicDataSource.setDefaultTargetDataSource(master);
        //配置多数据源
        Map<Object, Object> map = new HashMap<>();
        map.put("master",master);
        map.put("slave1",slave1);
        dynamicDataSource.setTargetDataSources(map);
        return  dynamicDataSource;
    }
}
