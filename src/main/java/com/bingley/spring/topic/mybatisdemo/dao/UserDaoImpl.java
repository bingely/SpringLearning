package com.bingley.spring.topic.mybatisdemo.dao;

import com.bingley.spring.topic.mybatisdemo.po.User;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;


 /**
   *
   * Author:  Mr.bingley
   * Version:
   * Date:  2017/8/15
  *
  *  请问具体的sql语句在哪里？
   */

public class UserDaoImpl implements UserDao {

	// 依赖注入
	private SqlSessionFactory sqlSessionFactory;

	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public User findUserById(int id) throws Exception {
		// 创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 调用SqlSession的增删改查方法
		// 第一个参数：表示statement的唯一标示
		User user = sqlSession.selectOne("test.findUserById", id);
		System.out.println(user);
		// 关闭资源
		sqlSession.close();
		return user;
	}

	@Override
	public List<User> findUsersByName(String name) {
		// 创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 调用SqlSession的增删改查方法
		// 第一个参数：表示statement的唯一标示
		List<User> list = sqlSession.selectOne("test.findUsersByName", name);
		System.out.println(list);
		// 关闭资源
		sqlSession.close();
		return list;
	}

	@Override
	public void insertUser(User user) {
		// 创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 调用SqlSession的增删改查方法
		// 第一个参数：表示statement的唯一标示
		sqlSession.insert("test.insertUser", user);

		System.out.println(user.getId());
		// 提交事务
		sqlSession.commit();
		// 关闭资源
		sqlSession.close();
	}

}
