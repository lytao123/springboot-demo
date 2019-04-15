package com.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.App;
import com.bean.Users2;
import com.service.HibernateService;

/**
* @Description 整合Hibernate 测试增删改查 
* @author 欧阳
* @since 2019年4月11日 下午6:59:23
* @version V1.0
*/
@RunWith(SpringRunner.class)
@SpringBootTest(classes={App.class})
public class HibernateServiceImplTest {

	@Autowired
	private HibernateService hibernateService;
	
	@Test
	public void testInsertUser() {
		hibernateService.insertUser(new Users2("12", "lisi"));
		System.out.println("Yes");
	}

	@Test
	public void testUpdateUser() {
		hibernateService.updateUser(new Users2("12", "李四"));
		System.out.println("Yes");
	}

	@Test
	public void testSelectUser() {
		List<Users2> users = hibernateService.selectUser();
		for(Users2 user2 : users) {
			System.out.println(user2);
		}
		System.out.println("Yes");
	}

	@Test
	public void testDeleteUser() {
		hibernateService.deleteUser("12");
		System.out.println("Yes");
	}

}
