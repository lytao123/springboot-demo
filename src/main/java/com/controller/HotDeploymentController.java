package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @Description Springboot 热部署
* @author 欧阳
* @since 2019年4月13日 下午4:24:21
* @version V1.0
*/

@RestController
public class HotDeploymentController {
	
	@RequestMapping("/hotDeployment")
	public String hotDeployment() {
		
		String result = "this is hotDeployment method";
		
		return result;
	}
	
//	@RequestMapping("/hotDeploymentHidden")
//	public String hotDeploymentHidden() {
//		
//		String result = "this is hotDeploymentHidden method";
//		
//		return result;
//	}
}
