package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @Description 抛出异常 Controller，测试异常
* @author 欧阳
* @since 2019年4月12日 下午12:48:31
* @version V1.0
*/

@Controller
public class ExceptionController {
	
	private static final Logger log = LoggerFactory.getLogger(ExceptionController.class);
	
	@RequestMapping("/exceptionMethod")
	public String exceptionMethod(Model model) throws Exception {
		
		model.addAttribute("msg", "没有抛出异常");
		
		int num = 1/0;
		log.info(String.valueOf(num));
		
		return "home";
	}
	
	/**
	 * 描述：捕获 ExceptionController 中的 ArithmeticException 异常
	 * @param model 将Model对象注入到方法中
	 * @param e 将产生异常对象注入到方法中
	 * @return 指定错误页面
	 */
//	@ExceptionHandler(value = {ArithmeticException.class})
//	public String arithmeticExceptionHandle(Model model, Exception e) {
//		
//		model.addAttribute("msg", "@ExceptionHandler" + e.getMessage());
//		log.info(e.getMessage());
//		
//		return "error";
//	}
}
