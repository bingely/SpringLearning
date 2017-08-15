package com.bingley.spring.topic.g_annotion.b_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {



	private StudentDao studentDao;

	// 按照名称注入
	// 为什么是加在这个位置？   没影响也可以放前面
	// 如果不按照名称注入会怎样？？？ TOOD
	@Autowired
	@Qualifier("studentDaoId")
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public void addStudent() {
		studentDao.save();
		System.out.println("b_web ---service");
	}
}
