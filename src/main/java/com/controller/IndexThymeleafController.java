package com.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.User;

/**
* @Description springboot整合Thymeleaf
* @author 欧阳
* @since 2019年4月10日 下午5:20:49
* @version V1.0
*/
@Controller
public class IndexThymeleafController {
	
	@RequestMapping("/indexThymeleaf/{id}")
	public String indexThymeleaf(Model model, User user, 
			@PathVariable(name="id") String id) {
		System.out.println(id);
		model.addAttribute("title", "springboot整合Thymeleaf");
		
		model.addAttribute("user", user);
		
		List<User> list = new ArrayList<>();
		list.add(new User("1", "zhangsan"));
		list.add(new User("2", "lisi"));
		list.add(new User("3", "wangwu"));
		list.add(new User("4", "赵六"));
		model.addAttribute("users", list);
		
		Map<String, User> map = new HashMap<>();
		map.put("11", new User("1", "zhangsan"));
		map.put("12", new User("2", "lisi"));
		map.put("13", new User("3", "wangwu"));
		map.put("14", new User("4", "赵六"));
		model.addAttribute("usersMap", map);
		
		model.addAttribute("nowDate", new Date());
		
		model.addAttribute("html", "<h3>zhangsan</h3>");
		
		return "indexThymeleaf";
	}
}
