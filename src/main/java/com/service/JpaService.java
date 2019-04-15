package com.service;

import java.util.List;

import com.bean.Users;

/**
* @Description 整合spring Jpa Service
* @author 欧阳
* @since 2019年4月11日 下午2:17:37
* @version V1.0
*/

public interface JpaService {
	
	/**
	 * 添加用户
	 * @param user
	 */
	public void insertUser(Users user);
	
	/**
	 * 更新用户
	 * @param user
	 */
	public void updateUser(Users user);
	
	/**
	 * 查询用户
	 * @param user
	 * @return
	 */
	public List<Users> selectUser();
	
	/**
	 * 删除用户
	 * @param id
	 */
	public void deleteUser(String id);
}
