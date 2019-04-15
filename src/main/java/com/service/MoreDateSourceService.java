package com.service;

import com.bean.MybatisUser;
import com.bean.MysqlUser;

/**
* @Description 多数据源事务管理 Service
* @author 欧阳
* @since 2019年4月11日 下午8:34:50
* @version V1.0
*/

public interface MoreDateSourceService {
	public void addUser(MybatisUser mybatisUser, MysqlUser mysqlUser);
}
