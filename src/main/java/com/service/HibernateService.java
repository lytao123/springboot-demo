package com.service;

import java.util.List;

import com.bean.Users2;

/**
* @Description 整合Hibernate Service
* @author 欧阳
* @since 2019年4月11日 下午2:17:37
* @version V1.0
*/

public interface HibernateService {
	
	/**
	 * 添加用户
	 * @param user
	 */
	public void insertUser(Users2 user);
	
	/**
	 * 更新用户
	 * @param user
	 */
	public void updateUser(Users2 user);
	
	/**
	 * 查询用户
	 * @param user
	 * @return
	 */
	public List<Users2> selectUser();
	
	/**
	 * 删除用户
	 * @param id
	 */
	public void deleteUser(String id);
}
