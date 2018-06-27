package com.st.DesignPatten.AbstractFactoryPatten;

public class FactoryProduce {

	public static AbstractFactory  getChoice(String choice)
	{
		if(choice.equals("Shape"))
			return new ShapeFactory();
		else if(choice.equals("Color"))
			return new ColorFacotry();
			
		return null;
	}
}
