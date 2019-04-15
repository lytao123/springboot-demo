package com.service.impl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.service.AsyncService;

/**
* @Description @Async 使用
* @author 欧阳
* @since 2019年4月14日 上午11:51:07
* @version V1.0
*/

@Service
public class AsyncServiceImpl implements AsyncService {
	
	private static final Logger log = LoggerFactory.getLogger(AsyncServiceImpl.class);
	
	private static final String result = "SUCCUSS";	//返回结果
	
	@Override
	public String commMethod() {
		
		log.info("2");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("3");
		
		return result;
	}
	
	@Override
	@Async
	public String asyncMethod() {
		
		log.info("2");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("3");
		
		return result;
	}

	@Override
	public String callableMethod() {
		
		class MyCallable implements Callable<String> {
	        @Override
			public String call() throws Exception {
	        	
	        	log.info("2");
	    		
	    		try {
	    			Thread.sleep(3000);
	    		} catch (InterruptedException e) {
	    			e.printStackTrace();
	    		}
	    		log.info("3");
	    		
	    		return result;
	        }
	    }
		
		ExecutorService pool = Executors.newFixedThreadPool(1);
		Future<String> submit = pool.submit(new MyCallable());
		String result = null;
		
		if(submit.isDone()) {
			try {
				result = submit.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 关闭线程池
        pool.shutdown();
        
        return result;
	}

}
