package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Users;
import com.dao.UsersDao;
import com.service.JpaService;

/**
* @Description 整合spring Jpa Service
* @author 欧阳
* @since 2019年4月11日 下午6:16:09
* @version V1.0
*/
@Service
public class JpaServiceImpl implements JpaService {

	@Autowired
	private UsersDao userDao;
	
	@Override
	@Transactional
	//@CacheEvict(value="users",allEntries=true) 清除缓存中以 users 缓存策略缓存的对象
	@CacheEvict(value="users", key="'user.selectUser'")
	public void insertUser(Users user) {
		userDao.save(user);
		
//		int num = 1/0;  //放开测试事务。预期结果为添加失败，库中无数据。测试结果与预期一致
	}

	@Override
	@Transactional
	public void updateUser(Users user) {
		userDao.save(user);
	}

	@Override
	@Cacheable(cacheNames="users",key="'user.selectUser'")
	public List<Users> selectUser() {
		
		return userDao.findAll();
	}

	@Override
	@Transactional
	public void deleteUser(String id) {
		userDao.deleteById(id);
	}

}
