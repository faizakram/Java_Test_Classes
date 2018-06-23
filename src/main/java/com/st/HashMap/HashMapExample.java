package com.st.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {2, 2, 3, 3, 5, 3, 4, 1, 7};
	
		  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		  for(int i:arr)
		   map.put(i, map.get(i) != null ? map.get(i) + 1 : 0);
		  System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());
		  
		  List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		  //list.stream().collect(Collectors.summarizingInt(mapper))
	}

}
