package com.controller;
/**
* @Description @Async 使用
* @author 欧阳
* @since 2019年4月14日 上午11:49:53
* @version V1.0
*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.AsyncService;

@RestController
public class AsyncController {
	
	private static final Logger log = LoggerFactory.getLogger(AsyncController.class);
	
	@Autowired
	private AsyncService asyncService;
	
	@RequestMapping("/commMethod")
	public String commMethod() {
		log.info("1");
		String result = asyncService.commMethod();
		log.info("4");
		
		return result;
	}
	
	@RequestMapping("/asyncMethod")
	public String asyncMethod() {
		log.info("1");
		String result = asyncService.asyncMethod();
		log.info("4");
		
		return result;
	}
	
	@RequestMapping("/callableMethod")
	public String callableMethod() {
		log.info("1");
		String result = asyncService.callableMethod();
		log.info("4");
		
		return result;
	}
}
