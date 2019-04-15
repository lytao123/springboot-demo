package com.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.App;
import com.bean.User;
import com.service.JdbcService;

/**
* @Description 测试整合  JdbcTemplate 结果
* @author 欧阳
* @since 2019年4月11日 下午2:42:53
* @version V1.0
*/

@RunWith(SpringRunner.class)
@SpringBootTest(classes={App.class})
public class JdbcServiceImplTest {

	@Autowired
	private JdbcService jdbcService;
	
	@Test
	public void testInsertUser() {
		jdbcService.insertUser(new User("11", "张三"));
		jdbcService.insertUser(new User("12", "lisi"));
		System.out.println("Yes");
	}

	@Test
	public void testUpdateUser() {
		User user = new User("11", "zhangsan");
		jdbcService.updateUser(user);
		System.out.println("Yes");
	}

	@Test
	public void testSelectUser() {
		List<User> users = jdbcService.selectUser(new User("11", "zhangsan"));
		for(User user : users) {
			System.out.println(user);
		}
		System.out.println("Yes");
	}

	@Test
	public void testDeleteUser() {
		jdbcService.deleteUser(12);
		System.out.println("Yes");
	}

}
