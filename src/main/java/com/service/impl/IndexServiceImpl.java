package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.config.CustomParam;
import com.service.IndexService;

/**
* @Description 类描述
* @author 欧阳
* @since 2019年4月7日 下午12:37:34
* @version V1.0
*/

@Service
public class IndexServiceImpl implements IndexService {

	//值
	@Value("${cus.val}")
	private String cusVal;
	
	//数组
	@Value("${cus.arr1}")
	private String[] arr1;
	
	@Autowired
	private CustomParam customParam;
	
	@Override
	public User getUser() {
		User user = new User();
		user.setId("U1001");
		user.setName("张三");
		
		System.out.println(customParam);
		return user;
	}
}
