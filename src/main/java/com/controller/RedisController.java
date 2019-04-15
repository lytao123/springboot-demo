package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Users;

/**
* @Description 整合 Redis 测试Controller
* @author 欧阳
* @since 2019年4月13日 下午3:20:08
* @version V1.0
*/
@RestController
public class RedisController {
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	@RequestMapping("/redishandle")
	public String redishandle() {
		
		//添加字符串
		redisTemplate.opsForValue().set("author", "欧阳");
		
		//获取字符串
		String value = (String)redisTemplate.opsForValue().get("author");
		System.out.println("author = " + value);
		
		//添加对象
		//重新设置序列化器
		redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
		redisTemplate.opsForValue().set("users", new Users("1" , "张三"));
		
		//获取对象
		//重新设置序列化器
		redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
		Users user = (Users)redisTemplate.opsForValue().get("users");
		System.out.println(user);
		
		//以json格式存储对象
		//重新设置序列化器
		redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Users.class));
		redisTemplate.opsForValue().set("usersJson", new Users("2" , "李四"));
		
		//以json格式获取对象
		//重新设置序列化器
		redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Users.class));
		user = (Users)redisTemplate.opsForValue().get("usersJson");
		System.out.println(user);
		
		return "home";
	}
}
