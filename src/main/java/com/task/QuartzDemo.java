package com.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
* @Description 定义任务类
* @author 欧阳
* @since 2019年4月14日 下午6:05:13
* @version V1.0
*/

public class QuartzDemo implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
//		System.out.println("Execute：" + new Date());
	}

}
