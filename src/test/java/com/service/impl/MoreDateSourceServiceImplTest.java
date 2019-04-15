package com.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.App;
import com.bean.MybatisUser;
import com.bean.MysqlUser;
import com.service.MoreDateSourceService;

/**
* @Description 多数据源事务管理 测试
* @author 欧阳
* @since 2019年4月11日 下午8:45:21
* @version V1.0
*/

@RunWith(SpringRunner.class)
@SpringBootTest(classes={App.class})
public class MoreDateSourceServiceImplTest {

	@Autowired
	private MoreDateSourceService moreDateSourceService;
	
	@Test
	public void testAddUser() {
		MybatisUser mybatisUser = new MybatisUser("12", "张三");
		MysqlUser mysqlUser = new MysqlUser("12", "张三");
		
		moreDateSourceService.addUser(mybatisUser, mysqlUser);
		System.out.println("Yes");
	}

}
