package com.config;

import java.util.Properties;

import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
* @Description 配置 SimpleMappingExceptionResolver 类处理异常
* @author 欧阳
* @since 2019年4月12日 下午5:01:08
* @version V1.0
*/

//@Configuration
public class GlobalException {
	
//	@Bean
	public SimpleMappingExceptionResolver
		getSimpleMappingExceptionResolver(){
		SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
		
		Properties mappings = new Properties();
		/*
		 * 参数一：异常的类型，注意必须是异常类型的全名
		 * 参数二：视图名称
		 */
		mappings.put("java.lang.ArithmeticException", "errors");
		
		//设置异常与视图映射信息的
		resolver.setExceptionMappings(mappings);
		
		return resolver;
	}
}
