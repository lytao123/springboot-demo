package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.MybatisUser;
import com.bean.MysqlUser;
import com.mybatis.UserMapper1;
import com.mysql.UserMapper2;
import com.service.MoreDateSourceService;

/**
* @Description 多数据源事务管理 Service
* @author 欧阳
* @since 2019年4月11日 下午8:35:42
* @version V1.0
*/
@Service
public class MoreDateSourceServiceImpl implements MoreDateSourceService {
	
	@Autowired
	private UserMapper2 userMapper2;
	
	@Autowired
	private UserMapper1 userMapper1;
	
	@Override
	@Transactional
	public void addUser(MybatisUser mybatisUser, MysqlUser mysqlUser) {
		
		userMapper1.insertUser(mybatisUser);
		userMapper2.insertUser(mysqlUser);
		
//		int num = 1/0;  //放开测试事务。预期结果为两个库都添加失败，库中无数据。测试结果与预期一致
	}

}
