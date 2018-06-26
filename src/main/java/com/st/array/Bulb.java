package com.st.array;

public class Bulb {

 public int solve(int A[], int N) {
		
		int state= 0, ans = 0;
		for (int i = 0; i < N;i++) {
			if (A[i] == state) {
				ans++;
				state = 1 - state;
			}
		}
		
		return ans;
	}
	
 public static void main(String k[])
 {
	 int a[] = {0, 1, 0, 1};
	 Bulb bulb = new Bulb();
	 System.out.println(bulb.solve(a, a.length)); 
 }
}
