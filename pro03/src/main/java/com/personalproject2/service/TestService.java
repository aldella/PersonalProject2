package com.personalproject2.service;

import java.util.List;

import com.personalproject2.per.dto.Test;

public interface TestService {
	public List<Test> getTestList();
	public Test getTest(int no);
	public void insTest(Test test);
	public void upTest(Test test);
	public void delTest(Test test);
}