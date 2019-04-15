package com.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description Scheduled 定时任务器
 * @author 欧阳
 * @since 2019年4月14日 下午2:16:42
 * @version V1.0
 */

@Component
public class ScheduledDemo {

	//每两秒执行一次
	@Scheduled(cron = "*/2 * * * * ?")
	public void scheduledMethod() {
//		System.out.println("Scheduled 定时器被触发:" + new Date());
	}
}
