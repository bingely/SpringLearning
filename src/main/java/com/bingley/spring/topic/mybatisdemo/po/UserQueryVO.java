package com.bingley.spring.topic.mybatisdemo.po;

import java.util.List;

 /**
   * 
   * Author:  Mr.bingley
   * Version: 
   * Date:  2017/8/15
   */
public class UserQueryVO {

	//用户信息
	private User user;
	
	//商品ID集合
	private List<Integer> idList;
	
	//商品信息

	public List<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	//订单信息
	
}
