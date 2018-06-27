package com.st.DesignPatten.AbstractFactoryPatten;

public class ColorFacotry extends AbstractFactory{

	@Override
	public Shape createShape(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color createColor(String str) {
		if(str.equals("RED"))
			return new Red();
		else if(str.equals("BLUE"))
			return new Blue();
		return null;
	}

}
