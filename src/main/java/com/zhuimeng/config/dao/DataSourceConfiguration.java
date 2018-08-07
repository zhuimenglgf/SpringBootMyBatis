package com.zhuimeng.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.beans.PropertyVetoException;

/**
 * Created by Administrator on 2018/7/27.
 */
@Configuration
public class DataSourceConfiguration {

    @Value("${spring.datasource.driver-class-name}")
    private String driver;
    @Value("${spring.datasource.password}")
    private String Password;
    @Value("${spring.datasource.username}")
    private String jdbcUser;
    @Value("${spring.datasource.url}")
    private String jdbcUrl;
    @Bean(name="dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUser);
        dataSource.setPassword(Password);
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }
}
