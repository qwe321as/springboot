package com.example.login.model;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;


public class loginDao {
	protected static final String NAMESPACE = "com.example.login.model.";

	@Autowired
	private SqlSession sqlSession;
	public String selectName(){
		return sqlSession.selectOne(NAMESPACE + "selectName");
	}
}
