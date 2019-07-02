package com.big.one.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.big.one.mapper")
@Configuration
public class DBConfig {

}
