package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.User;
import com.service.MybatisService;

/**
* @Description 并发测试
* @author 欧阳
* @since 2019年4月15日 下午3:27:04
* @version V1.0
*/

@RestController
public class ConcurrentTestController {
	
	@Autowired
	private MybatisService mybatisService;
	
	@RequestMapping("/selectAllUsers")
	public List<User> selectAllUsers() {
		List<User> result = mybatisService.selectUser();
		
		return result;
	}
}
