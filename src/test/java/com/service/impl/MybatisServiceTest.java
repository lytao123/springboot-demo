package com.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.App;
import com.bean.User;
import com.service.MybatisService;

/**
* @Description springboot 整合 mybatis 增删改查测试
* @author 欧阳
* @since 2019年4月11日 下午4:34:45
* @version V1.0
*/

@RunWith(SpringRunner.class)
@SpringBootTest(classes={App.class})
public class MybatisServiceTest {

	@Autowired
	private MybatisService mybatisService;
	
	@Test
	public void testInsertUser() {
		mybatisService.insertUser(new User("14", "mybatis"));
		System.out.println("Yes");
	}

	@Test
	public void testUpdateUser() {
		mybatisService.updateUser(new User("14", "mybatis1.1"));
		System.out.println("Yes");
	}

	@Test
	public void testSelectUser() {
		List<User> users = mybatisService.selectUser();
		for(User user : users) {
			System.out.println(user);
		}
		System.out.println("Yes");
	}

	@Test
	public void testDeleteUser() {
		mybatisService.deleteUser("14");
		System.out.println("Yes");
	}

}
