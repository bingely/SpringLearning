package com.bingley.spring.topic.mybatisdemo.test;

import com.bingley.spring.topic.mybatisdemo.dao.UserDao;
import com.bingley.spring.topic.mybatisdemo.dao.UserDaoImpl;
import com.bingley.spring.topic.mybatisdemo.po.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.fail;

/**
 * Author:  Mr.bingley
 * Version:
 * Date:  2017/8/15
 */
public class UserDaoTest {

    private SqlSessionFactory sqlSessionFactory;

    // 关键词Before
    @Before
    public void setUp() throws Exception {
        // 读取配置文件
        // 全局配置文件的路径
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }


    @Test
    public void testFindUserById() throws Exception {

        // 创建UserDao
        UserDao dao = new UserDaoImpl(sqlSessionFactory);

        User user = dao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testFindUsersByName() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsertUser() {
        fail("Not yet implemented");
    }

}
