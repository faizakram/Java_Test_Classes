package com.st.String;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.trim();
		//str = str.replace(" ", "");
		char ch[] = null;	
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != 'a')
				ch[i] = '_';
			ch[i] = str.charAt(i);
				
		}
		String st = new String(ch);
		System.out.println(st);
	}

}
