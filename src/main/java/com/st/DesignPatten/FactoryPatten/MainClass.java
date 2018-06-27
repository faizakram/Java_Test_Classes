package com.st.DesignPatten.FactoryPatten;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = FactoryPatter.createShape("Circle");
		shape.getInfo();
	}

}
