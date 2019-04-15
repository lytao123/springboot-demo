package com.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
* @Description 类描述
* @author 欧阳
* @since 2019年4月7日 下午12:29:13
* @version V1.0
*/

@Getter
@Setter
@ToString
public class User {
	private String id;
	private String name;
	
	public User() {
		super();
	}
	
	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	
}
