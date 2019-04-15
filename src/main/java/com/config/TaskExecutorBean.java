package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
* @Description 
*   注入 TaskExecutor 解决 No task executor bean found for async processing: 
* 	no bean of type TaskExecutor and no bean named ‘taskExecutor’ either
* @author 欧阳
* @since 2019年4月14日 下午12:28:11
* @version V1.0
*/

@Configuration
public class TaskExecutorBean {
	
	@Bean
	public TaskExecutor getTaskExecutor() {
		
		return new ThreadPoolTaskExecutor();
	}
}
