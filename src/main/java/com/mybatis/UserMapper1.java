package com.mybatis;

import java.util.List;

import com.bean.MybatisUser;

/**
* @Description springboot 整合jta-atomikos 数据源1
* @author 欧阳
* @since 2019年4月11日 下午4:26:00
* @version V1.0
*/

public interface UserMapper1 {
	/**
	 * 添加用户
	 * @param user
	 */
	public void insertUser(MybatisUser mybatisUser);
	
	/**
	 * 更新用户
	 * @param user
	 */
	public void updateUser(MybatisUser mybatisUser);
	
	/**
	 * 查询用户
	 * @param user
	 * @return
	 */
	public List<MybatisUser> selectUsersAll();
	
	/**
	 * 删除用户
	 * @param id
	 */
	public void deleteUserById(String id);
}
