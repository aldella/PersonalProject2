package com.personalproject2.per.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.personalproject2.per.dto.Test;

@Repository
public class TestDAOImp1 implements TestDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Test> getTestList() {
		return sqlSession.selectList("test.getTestList");
	}

	@Override
	public Test getTest(int no) {
		return sqlSession.selectOne("test.getTest");
	}

	@Override
	public void insTest(Test test) {
		sqlSession.insert("test.insTest", test);
	}

	@Override
	public void upTest(Test test) {
		sqlSession.update("test.insTest", test);
	}

	@Override
	public void delTest(Test test) {
		sqlSession.delete("test.insTest", test);
	}
	
}
