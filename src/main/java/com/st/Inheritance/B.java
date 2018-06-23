package com.st.Inheritance;

public class B extends A {

	public void test(String value)
	{
		System.out.println("=======q" + value);
	}
	
	public static void main(String [] k)
	{
		A a = new B();
		a.test("Faiz");
	}
}
