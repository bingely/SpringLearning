package com.bingley.spring.topic.mybatisdemo.dao;

import com.bingley.spring.topic.mybatisdemo.po.User;

import java.util.List;


 /**
   *
   * Author:  Mr.bingley
   * Version:
   * Date:  2017/8/15
   */
public interface UserDao {
	// 1、 根据用户ID查询用户信息
	public User findUserById(int id) throws Exception;

	// 2、 根据用户名称模糊查询用户列表
	public List<User> findUsersByName(String name) throws Exception;

	// 3、 添加用户
	public void insertUser(User user) throws Exception;


}
