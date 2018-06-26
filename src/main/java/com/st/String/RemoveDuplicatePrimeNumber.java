package com.st.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RemoveDuplicatePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(17);
		list.add(12);
		list.add(11);
		list.add(13);
		list.add(17);
		list.add(29);
		list.add(17);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if (Collections.frequency(list, list.get(i)) > 1) {
				final Integer number = list.get(i);
				if(LongStream.range(2, (long) Math.ceil(Math.sqrt(number + 1))).noneMatch(x -> number % x == 0))
				{
					list.remove(i);
				}
			}
		}
		//System.out.println(Collections.frequency(list, list.get(0)));
		//list.remove(2);
		
		System.out.println(list);
		
		 IntStream.rangeClosed(2, 100)
         .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
                 .allMatch(j -> i%j != 0))
         .forEach(n -> {
             System.out.println(n);
         });

	}

}
