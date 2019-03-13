package com.pengguozhen.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ConfigBean //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
{ 
	@Bean
	@LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
//	@Bean
//	public IRule myRule()
//	{
//		//return new RoundRobinRule();
//		//return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
//		return new RetryRule();
//	}
}

/*
 * 1、Springboot 中 @Configuration+@Bean 注解的作用
 * applicationContext.xml == ConfigBean(@Configuration)
 * <bean id="userServcie" class="com.pengguozhen.tmall.UserServiceImpl">==@Bean
 * */
//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}

/*2、RestTemplate 类的使用
 * 
 * 类似
 * spring JDBCTemplate 访问 JDBC
 * spring RestTemplate 
 * spring+Redis RedisTemplate
 * 
 * RestTemplate ：提供了多种便捷访问远程 Http 服务的方法。是一种简单便捷的访问 restful 服务模板类；
 * 				是spring 提供的用于访问 Rest 服务的客户端模板工具集。
 * 官网及使用：
 * 	https://docsspring./sprng-framewor/docs/4.3.7.release/javadoc-api/org/springframework/web/client/resttempla
 * te.html
 * 
 * 使用 RestTemplate 访问 rest 接口非常简单粗暴
 * (url,requestMap,ResponseBean.class)这三个参数分别代表 Rest请求地址、请求参数、HTTP响应转换被转换成的对象类型。
 * */
