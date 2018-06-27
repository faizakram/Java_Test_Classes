package com.st.recursion;

public class RecursionExample {

	public int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionExample recu = new RecursionExample();
		System.out.println(recu.fact(5));
	}

}
