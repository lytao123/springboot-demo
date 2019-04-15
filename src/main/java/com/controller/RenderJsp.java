package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
* @Description JSP 渲染
* @author 欧阳
* @since 2019年4月7日 下午5:11:05
* @version V1.0
*/

@Controller
public class RenderJsp {
	
	@RequestMapping("/renderJsp")
	public ModelAndView renderJsp() {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("msg", "渲染jsp页面");
		return modelAndView;
	}
}
