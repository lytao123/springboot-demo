package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.User;
import com.mapper.UserMapper;
import com.service.MybatisService;

/**
* @Description springboot 整合 mybatis 的Service
* @author 欧阳
* @since 2019年4月11日 下午4:30:37
* @version V1.0
*/

@Service
public class MybatisServiceImpl implements MybatisService {
	
	@Autowired
	private UserMapper usersMapper;
	
	@Override
	@Transactional
	public void insertUser(User user) {
		
		usersMapper.insertUser(user);
		
//		int num = 1/0;  //放开测试事务。预期结果为添加失败，库中无数据。测试结果与预期一致
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		usersMapper.updateUser(user);
	}

	@Override
	public List<User> selectUser() {
		return usersMapper.selectUsersAll();
	}

	@Override
	@Transactional
	public void deleteUser(String id) {
		usersMapper.deleteUserById(id);
	}
}
