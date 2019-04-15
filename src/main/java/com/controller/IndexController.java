package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;
import com.service.IndexService;

/**
* @Description 第一个Controller
* @author 欧阳
* @since 2019年4月7日 下午12:27:08
* @version V1.0
*/

@RestController
public class IndexController {
	//@RestController 注解等同于 @Controller + @ResponseBody
	
	@Autowired
	private IndexService indexService;
	
	@RequestMapping("/index")
	public User index() {
		
		return indexService.getUser();
	}
	
	@RequestMapping("/fileUpload")
	public ModelAndView fileUpload(List<MultipartFile> files, 
			ModelAndView modelAndView) {
		
		for(MultipartFile file : files) {
			try {
				file.transferTo(new File("D:/logs/" + file.getOriginalFilename()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		modelAndView.addObject("msg", "OK." + files.size());
		modelAndView.setViewName("home");
		return modelAndView;
	}
}
