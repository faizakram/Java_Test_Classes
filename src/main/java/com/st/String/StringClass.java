package com.st.String;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		String name = new String("Faiz");
		name = name.intern();
		 String name1 = "Faiz";
		 String name2 = "Faiz";
		 System.out.println(name == name1);
		byte[] byteArr = name.getBytes();
		System.out.println(Arrays.toString(byteArr));
		StringClass strClass = new StringClass();
		System.out.println(strClass.isPalindromeString("LOL"));
		permutation("FAIZ");
	}

	public boolean reverse(String str) {
		if (str == null)
			return false;
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString().equals("");
	}

	private static boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		// int length = str.length();
		// System.out.println(length / 2);
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1))
				return false;
		}
		return true;
	}
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) 
	    	System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
}

