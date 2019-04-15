package com.config;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.bean.User;

/**
* @Description 获取yml中自定义的参数
* @author 欧阳
* @since 2019年4月7日 下午1:48:27
* @version V1.0
*/
@Component
@ConfigurationProperties(prefix="cus")
public class CustomParam {
	
	private String val;
	private User bean;
	private String[] arr1;
	private String[] arr2;
	private List<String> list;
	private Map<String, String> map;
	private List<Map<String, String>> listmap;
	
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public User getBean() {
		return bean;
	}
	public void setBean(User bean) {
		this.bean = bean;
	}
	
	public String[] getArr1() {
		return arr1;
	}
	public void setArr1(String[] arr1) {
		this.arr1 = arr1;
	}
	public String[] getArr2() {
		return arr2;
	}
	public void setArr2(String[] arr2) {
		this.arr2 = arr2;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public List<Map<String, String>> getListmap() {
		return listmap;
	}
	public void setListmap(List<Map<String, String>> listmap) {
		this.listmap = listmap;
	}
	@Override
	public String toString() {
		return "CustomParam [val=" + val + ", bean=" + bean + ", arr1=" + Arrays.toString(arr1) + ", arr2="
				+ Arrays.toString(arr2) + ", list=" + list + ", map=" + map + ", listmap=" + listmap + "]";
	}
	
}
