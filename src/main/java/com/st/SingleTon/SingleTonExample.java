package com.st.SingleTon;

public class SingleTonExample {

	public final static SingleTonExample instance = new SingleTonExample();

	private SingleTonExample() {
		if( SingleTonExample.instance != null ) {
	        throw new InstantiationError( "Creating of this object is not allowed." );
	    }
	}
}
