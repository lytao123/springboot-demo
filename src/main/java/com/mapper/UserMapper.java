package com.mapper;

import java.util.List;

import com.bean.User;

/**
* @Description springboot 整合mybatis
* @author 欧阳
* @since 2019年4月11日 下午4:26:00
* @version V1.0
*/

public interface UserMapper {
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
	public List<User> selectUsersAll();
	
	/**
	 * 删除用户
	 * @param id
	 */
	public void deleteUserById(String id);
}
