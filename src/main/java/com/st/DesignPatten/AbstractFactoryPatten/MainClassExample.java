package com.st.DesignPatten.AbstractFactoryPatten;

public class MainClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory abs = FactoryProduce.getChoice("Shape");
		Shape sh = abs.createShape("CIRCLE");
		sh.getInfo();
	}

}
