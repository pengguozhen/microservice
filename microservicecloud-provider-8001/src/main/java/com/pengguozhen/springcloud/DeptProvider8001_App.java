package com.pengguozhen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//@EnableDiscoveryClient //服务发现
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中(使用该注解需引入 spring-cloud-starter-eureka、spring-cloud-starter-config依赖；配置yml)
@SpringBootApplication
public class DeptProvider8001_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8001_App.class, args);
	}
}
