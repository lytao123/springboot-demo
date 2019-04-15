package com.service;

import java.util.List;

import com.bean.User;

/**
* @Description 整合JDBCTemplate Service
* @author 欧阳
* @since 2019年4月11日 下午2:17:37
* @version V1.0
*/

public interface JdbcService {
	
	/**
	 * 添加用户
	 * @param user
	 */
	public void insertUser(User user);
	
	/**
	 * 更新用户
	 * @param user
	 */
	public void updateUser(User user);
	
	/**
	 * 查询用户
	 * @param user
	 * @return
	 */
	public List<User> selectUser(User user);
	
	/**
	 * 删除用户
	 * @param id
	 */
	public void deleteUser(Integer id);
}
