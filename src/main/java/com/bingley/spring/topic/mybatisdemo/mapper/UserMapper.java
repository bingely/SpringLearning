package com.bingley.spring.topic.mybatisdemo.mapper;

import com.bingley.spring.topic.mybatisdemo.po.User;
import com.bingley.spring.topic.mybatisdemo.po.UserQueryVO;

import java.util.List;


 /**
   * 
   * Author:  Mr.bingley
   * Version: 
   * Date:  2017/8/15
   */
public interface UserMapper {
	// 1、 根据用户ID查询用户信息
	public User findUserById(int id) throws Exception;

	// 3、 添加用户
	public void insertUser(User user) throws Exception;
	
	//综合查询
	public List<User> findUserList(UserQueryVO vo);
	
	//综合查询用户总数
	public int findUserCount(UserQueryVO vo);
	
	//resultMap入门
	public User findUserRstMap(int id);
}
