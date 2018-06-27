package com.st.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringList {

	public static void main(String k[]) {
		/*
		 * List<String> str = new ArrayList<String>(); Scanner sc = new
		 * Scanner(System.in);
		 * 
		 * for(int i=0; i < 5 ;i++) { String string =sc.nextLine().trim();
		 * System.out.print(str.stream().anyMatch(string::contains)); str.add(string);
		 * 
		 * 
		 * }
		 */

		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(0);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		/*Integer a = null;
		int j = 0;
		System.out.println(num);
		while (j < 2) {
			for (int i = 0; i < num.size(); i++) {
				if (i == 0) {
					a = num.get(i);
					continue;
				}

				num.set(i - 1, num.get(i));
				num.set(i, a);
				a = num.get(i);
			}
			j++;
		}*/
		// int temp=0;
		/*
		 * for(int i=0; i < 2;i++) { temp = num.get(i); num.remove(i); num.add(temp); }
		 */
		/*Collections.sort(num);
		Integer arr[] = {1,2,3,4,5,6,7};
		 for(int a0 = 0; a0 < 2; a0++){
		        int m = 2;
		        System.out.println(arr[(int) ((n - (k % n)+ m) % n)]);
		    }  
		System.out.println(num);*/
		

			  
			 Scanner sc=new Scanner(System.in);
			 long n=sc.nextInt();
			 long k1=sc.nextInt();
			 long q=sc.nextInt();
			 
			 
			 long arr[]=new long[(int) n];
			 for(int i=0;i<n;i++){
			  arr[i]=sc.nextLong();
			 }
			 for(int a0 = 0; a0 < q; a0++){
			        int m = sc.nextInt();
			        System.out.println(arr[(int) ((n - (k1 % n)+ m) % n)]);
			    }  
			  
	}

}
