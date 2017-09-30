package com.cel.cloud.configUtils;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.cel.cloud.*")
@PropertySource(value={"classpath:jdbc.properties"}, ignoreResourceNotFound = true)
public class ConfigurationUtils {
	
	@Value("${jdbc.driverClassName}")
	private String driverClassName;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Bean
	public DataSource dataSource(){
		//BasicDataSource bds = new BasicDataSource();
		DriverManagerDataSource bds = new DriverManagerDataSource();
		bds.setDriverClassName(driverClassName);
		bds.setUrl(url);
		bds.setUsername(username);
		bds.setPassword(password);
		return bds;
	}
}
