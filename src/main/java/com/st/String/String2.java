package com.st.String;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString= "Hello World";
		 String[] words = inputString.split(" ");
		 for(int i=words.length; i>0; i--,System.out.print(words[i]+" "));
		 //System.out.println(words);
	}

}
