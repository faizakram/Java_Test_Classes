package com.st.DesignPatten.FactoryPatten;

public class FactoryPatter {
	
	public static Shape createShape(String shape)
	{
		if(shape.equals("Circle"))
			return new Circle();
		else if(shape.equals("Squre"))
			return new Squre();
		return null;
			
	}
	
}
