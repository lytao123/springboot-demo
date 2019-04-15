package com.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.App;
import com.bean.Users;
import com.service.JpaService;

/**
* @Description 类描述
* @author 欧阳
* @since 2019年4月11日 下午6:21:24
* @version V1.0
*/

@RunWith(SpringRunner.class)
@SpringBootTest(classes={App.class})
public class JpaServiceImplTest {

	@Autowired
	private JpaService jpaService;
	
	@Test
	public void testInsertUser() {
		jpaService.insertUser(new Users("12", "lisi"));
		System.out.println("Yes");
	}

	@Test
	public void testUpdateUser() {
		jpaService.updateUser(new Users("12", "李四"));
		System.out.println("Yes");
	}

	@Test
	public void testSelectUser() {
		jpaService.selectUser();
		System.out.println("Yes");
	}

	@Test
	public void testDeleteUser() {
		jpaService.deleteUser("12");
		System.out.println("Yes");
	}

}
