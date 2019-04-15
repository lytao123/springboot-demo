package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;

/**
* @Description 测试整合freemarker
* @author 欧阳
* @since 2019年4月10日 下午3:55:10
* @version V1.0
*/
@RestController
public class IndexMarkerController {
	
	@RequestMapping("/indexmarker")
	public ModelAndView indexmarker(Map<String, Object> map) {
		ModelAndView modelAndView = new ModelAndView("indexmarker");
		//添加标题
		map.put("title", "SpringBoot整合Freemarker");
		//添加人员
		List<User> result = new ArrayList<User>();
		result.add(new User("1", "zhangsan"));
		result.add(new User("2", "lisi"));
		result.add(new User("3", "王五"));
		map.put("users", result);
		modelAndView.addAllObjects(map);
		return modelAndView;
	}
}
