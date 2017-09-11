package com.gmail.itaofei.springboot.course;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.MappedTypes;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@MappedTypes(com.gmail.itaofei.springboot.course.domain.Topic.class)
@MapperScan("com.gmail.itaofei.springboot.course.mapper")
@Configuration
@PropertySource("classpath:/mybatis.properties")
public class AppConfig {

}
