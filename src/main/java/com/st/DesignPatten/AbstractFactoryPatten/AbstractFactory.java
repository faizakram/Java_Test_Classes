package com.st.DesignPatten.AbstractFactoryPatten;

public abstract class AbstractFactory {
	public abstract Shape createShape(String str);
	public abstract Color createColor(String str);
}
