package com.mysql;

import java.util.List;

import com.bean.MysqlUser;

/**
* @Description springboot 整合jta-atomikos 数据源2
* @author 欧阳
* @since 2019年4月11日 下午4:26:00
* @version V1.0
*/

public interface UserMapper2 {
	/**
	 * 添加用户
	 * @param user
	 */
	public void insertUser(MysqlUser mysqlUser);
	
	/**
	 * 更新用户
	 * @param user
	 */
	public void updateUser(MysqlUser mysqlUser);
	
	/**
	 * 查询用户
	 * @param user
	 * @return
	 */
	public List<MysqlUser> selectUsersAll();
	
	/**
	 * 删除用户
	 * @param id
	 */
	public void deleteUserById(String id);
}
