package com.personalproject2.per.dao;

import java.util.List;

import com.personalproject2.per.dto.Test;

public interface TestDAO {
	public List<Test> getTestList();
	public Test getTest(int no);
	public void insTest(Test test);
	public void upTest(Test test);
	public void delTest(Test test);
	
}
