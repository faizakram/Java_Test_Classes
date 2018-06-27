package com.st.DesignPatten.TemplateDesignPattern;

public class Football extends GameTemplate{

	@Override
	public void initilize() {
		// TODO Auto-generated method stub
		System.out.println("Initilized Game");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Game Started");
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		System.out.println("Game Ended");
	}
}
