package com.pengguozhen.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/*全参构造器
*/
//@AllArgsConstructor
@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor//设置无参构造器
@Data//设置 get、set 方法
@Accessors(chain=true)//链式方法调用
public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	deptno; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Dept(String dname)
	{
		super();
		
		
		this.dname = dname;
	}
//	public Dept(Long deptno, String dname, String db_source) {
//		super();
//		this.deptno = deptno;
//		this.dname = dname;
//		this.db_source = db_source;
//	}
	
	
}