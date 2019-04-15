package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Users;
import com.service.JpaService;

/**
* @Description 整合 Ehcache
* @author 欧阳
* @since 2019年4月13日 上午12:37:52
* @version V1.0
*/

@RestController
public class EhcacheController {
	
	@Autowired
	private JpaService jpaService;
	
	@Autowired
	private CacheManager cacheManager;

	@SuppressWarnings("unchecked")
	@RequestMapping("/findAllUser")
	public List<Users> findAllUser() {
		
		//确保第一次查询是从数据库查询的数据，所以将缓存清除
		//使用@CacheEvict 清除缓存
		jpaService.insertUser(new Users("13", "李四"));
		
		//第一次查询
		System.out.println("---------------第一次查询----------------");
		jpaService.selectUser();
		
		//第二次查询
		System.out.println("---------------第二次查询----------------");
		jpaService.selectUser();
		
		//第一次从缓存中获取查询的值
		System.out.println("---------------第一次从缓存中取值----------------");
		Cache cache = cacheManager.getCache("users");
		ValueWrapper valueWrapper = cache.get("user.selectUser");
		List<Users> result = null;
		if(valueWrapper != null) {
			result = (List<Users>)valueWrapper.get();
			
			for(Users user : result) {
				System.out.println(user);
			}
		}
		
		
		//使用 CacheManager 清空缓存
		cache.clear();
		
		//第二次从缓存中获取查询的值
		System.out.println("---------------第二次从缓存中取值----------------");
		valueWrapper = cache.get("user.selectUser");
		if(valueWrapper != null) {
			result = (List<Users>)valueWrapper.get();
			
			for(Users user : result) {
				System.out.println(user);
			}
		}
		
		//第三次查询
		System.out.println("---------------第三次查询----------------");
		jpaService.selectUser();
		
		//第三次从缓存中获取查询的值
		System.out.println("---------------第三次从缓存中取值----------------");
		valueWrapper = cache.get("user.selectUser");
		if(valueWrapper != null) {
			result = (List<Users>)valueWrapper.get();
			
			for(Users user : result) {
				System.out.println(user);
			}
		}
		
		return result;
	}
}
