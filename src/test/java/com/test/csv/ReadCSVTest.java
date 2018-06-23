package com.test.csv;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.st.CSV.ReadCSV;

public class ReadCSVTest {
	
	private ReadCSV read= null;
	
	@Before
	public void before()
	{
		read = new ReadCSV();
		read.getOutput("E:\\Backup\\test.csv");
	}
	 
	@Test
	public void sumOfSalaryTest()
	{
		assertNotNull(read.sumOfSalary(read.users)); 
	}
	
/*	@Test
	public void test1()
	{
		read.getOutput("E:\\Backup\\test.csv");
		assertSame(expected, read.groupByOfGender(users));(read.sumOfSalary(read.users)); 
	}*/

}
