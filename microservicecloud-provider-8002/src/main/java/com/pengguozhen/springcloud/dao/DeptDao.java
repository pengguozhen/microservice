package com.pengguozhen.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pengguozhen.springcloud.entities.Dept;

/**
 * 添加了@Mapper注解之后这个接口在编译时会生成相应的实现类
 * 
 * 需要注意的是：这个接口中不可以定义同名的方法，因为会生成相同的id
 * 也就是说这个接口是不支持重载的
 */
@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
