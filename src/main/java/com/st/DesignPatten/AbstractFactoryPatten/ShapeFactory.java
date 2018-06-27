package com.st.DesignPatten.AbstractFactoryPatten;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape createShape(String str) {
		if(str.equals("CIRCLE"))
			return new Circle();
		else if(str.equals("SQUARE"))
			return new Squre();
		return null;
	}

	@Override
	public Color createColor(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
