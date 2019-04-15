package com.service;
/**
* @Description @Async 使用
* @author 欧阳
* @since 2019年4月14日 上午11:50:34
* @version V1.0
*/

public interface AsyncService {

	/**
	 * 描述：普通的方法
	 * @return
	 */
	public String commMethod();
	
	/**
	 * 描述：使用  @Async 实现异步调用
	 * @return
	 */
	public String asyncMethod();
	
	/**
	 * 描述：使用 Callable 实现异步调用
	 * @return
	 */
	public String callableMethod();
}
