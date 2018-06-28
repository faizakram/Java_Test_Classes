package com.st.DesignPatten.VisitorPattarn;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
