package com.config;

import org.quartz.impl.triggers.CoreTrigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.task.QuartzDemo;

/**
 * @Description Quartz 配置类
 * @author 欧阳
 * @since 2019年4月14日 下午6:07:01
 * @version V1.0
 */

@Configuration
public class QuartzConfig {

	/**
	 * 1.创建 Job 对象
	 */
	@Bean
	public JobDetailFactoryBean jobDetailFactoryBean() {
		JobDetailFactoryBean jobDetailFactoryBean = new JobDetailFactoryBean();

		// 关联我们自己的 Job 类
		jobDetailFactoryBean.setJobClass(QuartzDemo.class);

		return jobDetailFactoryBean;
	}

	/**
	 * 2.创建 Trigger 对象
	 */
	@Bean
	public CronTriggerFactoryBean cronTriggerFactoryBeanBean(JobDetailFactoryBean jobDetailFactoryBean) {
		CronTriggerFactoryBean cronTriggerFactoryBeanBean = new CronTriggerFactoryBean();
		
		// 关联 JobDetail对象
		cronTriggerFactoryBeanBean.setJobDetail(jobDetailFactoryBean.getObject());
		// 每两秒执行一次
		cronTriggerFactoryBeanBean.setCronExpression("*/2 * * * * ?");

		return cronTriggerFactoryBeanBean;
	}

	/**
	 * 3.创建 Scheduler 对象
	 */
	@Bean
	public SchedulerFactoryBean schedulerFactoryBean(CronTriggerFactoryBean cronTriggerFactoryBeanBean) {
		SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
		// 关联 trigger
		schedulerFactoryBean.setTriggers(cronTriggerFactoryBeanBean.getObject());
		
		return schedulerFactoryBean;
	}
}
