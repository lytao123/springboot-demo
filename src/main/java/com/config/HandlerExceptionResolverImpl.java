package com.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
* @Description 实现 HandlerExceptionResolver 接口处理异常
* @author 欧阳
* @since 2019年4月12日 下午5:13:58
* @version V1.0
*/

//@Configuration
public class HandlerExceptionResolverImpl implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("msg", "实现 HandlerExceptionResolver 接口处理异常");
		
		//判断不同异常类型，做不同视图跳转
		if(ex instanceof ArithmeticException){
			modelAndView.setViewName("error");
		} else {
			modelAndView.setViewName("errors");
		}
		
		return modelAndView;
	}

}
