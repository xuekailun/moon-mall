package com.moon.mall.goods.config.seata;

import com.alibaba.druid.pool.DruidDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @Auther Xue KaiLun
 * @Date 2021-06-30 14:09
 */
@Slf4j
@Configuration
public class SeataDataSourceProxyConfiguration {

    /* 注入数据源 */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }

    // 创建代理数据源
    @Bean
    public DataSourceProxy dataSourceProxy(DataSource druidDataSource){
        return new DataSourceProxy(druidDataSource);
    }


    @Bean(name="sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory(DataSourceProxy dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/*Dao.xml"));
        return sqlSessionFactoryBean;
    }
}
