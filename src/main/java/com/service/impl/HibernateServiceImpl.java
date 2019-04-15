package com.service.impl;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Users2;
import com.dao.UsersDao2;
import com.service.HibernateService;

/**
* @Description 整合Hibernate Service
* @author 欧阳
* @since 2019年4月11日 下午6:16:09
* @version V1.0
*/
@Service
public class HibernateServiceImpl implements HibernateService {

	@Autowired
	private UsersDao2 userDao2;
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public SessionFactory getSessionFactory() {
		return entityManagerFactory.unwrap(SessionFactory.class);
	}
	
	@Override
	@Transactional
	public void insertUser(Users2 user) {
		userDao2.save(user);
		
//		int num = 1/0;  //放开测试事务。预期结果为添加失败，库中无数据。测试结果与预期一致
	}

	@Override
	@Transactional
	public void updateUser(Users2 user) {
		userDao2.save(user);
	}

	@Override
	public List<Users2> selectUser() {
		String sql = "SELECT u FROM Users2 u ";
		@SuppressWarnings("unchecked")
		List<Users2> resultList = getSessionFactory().openSession()
				.createQuery(sql)
				.getResultList();
		
		userDao2.findName1("张三");
		userDao2.findName2("张三");
		return resultList;
	}

	@Override
	@Transactional
	public void deleteUser(String id) {
		userDao2.deleteById(id);
	}

}
