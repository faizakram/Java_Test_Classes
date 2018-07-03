package com.st.Permutations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.LongStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> items = Arrays.asList("a","b","c","d","e","1","2","3","4","5");
		long permutations = Permutations.factorial(items.size());
		System.out.println(items + " can be combined in " + permutations + " different ways:");

		LongStream.range(0, permutations).forEachOrdered(i -> {
			System.out.println(i + ": " + Permutations.permutation(i, items));
		});
		
		Permutations.of("A", "B", "C")
        .flatMap(Function.identity())
        .forEachOrdered(System.out::print);
	}

}
