package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bean.Users2;

/**
* @Description 整合Hibernate Dao
* @author 欧阳
* @since 2019年4月11日 下午6:14:26
* @version V1.0
*/

public interface UsersDao2 extends JpaRepository<Users2, String> {
	
	@Query(value = "FROM Users2 WHERE name = :name")
    public Users2 findName1(@Param("name") String name);
	
	@Query(value = "SELECT * FROM t_user WHERE name=?1", nativeQuery = true)
	public Users2 findName2(String name);
}
