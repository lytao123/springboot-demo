package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Users;

/**
* @Description 整合spring Jpa Dao
* @author 欧阳
* @since 2019年4月11日 下午6:14:26
* @version V1.0
*/

public interface UsersDao extends JpaRepository<Users, String> {
	//需要使用其他的在这里定义方法
	
}
