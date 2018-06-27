package com.st.DesignPatten.TemplateDesignPattern;

public abstract class GameTemplate {
	
	public abstract void initilize();
	public abstract void start();
	public abstract void end();
	
	public final void play()
	{
		initilize();
		start();
		end();
	}

}
