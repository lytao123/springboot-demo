package com.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
@Entity(name = "t_user")
public class Users implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@Column(name="name")
	private String name;
	
	public Users() {
		super();
	}
	
	public Users(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	
}
