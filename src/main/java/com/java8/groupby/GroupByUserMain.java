package com.java8.groupby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByUserMain {

	private static <T> Collector<T, ?, List<T>> limitingList(int limit) {
		return Collector.of(ArrayList::new, (l, e) -> {
			if (l.size() < limit)
				l.add(e);
		}, (l1, l2) -> {
			l1.addAll(l2.subList(0, Math.min(l2.size(), Math.max(0, limit - l1.size()))));
			return l1;
		});
	}

	public static void main(String[] args) {

		List<User> users = GenrateUserData.genrateData();
		// Way 1
		Map<String, List<User>> user = users.stream().collect(Collectors.groupingBy(User::getAddress, limitingList(2)));
		System.out.println("Way One");
		System.out.println(user);

		// Way 2
		final int N = 5;
		/*
		 * final int N = 10; final HashMap<String, List<User>> groupByTeachers =
		 * users.stream().collect(groupingBy(User::getAddress, HashMap::new,
		 * collectingAndThen(toList(), list -> list.subList(0, Math.min(list.size(),
		 * N)))));
		 */
		// way 3

		Map<String, List<User>> groupByUsers = users.stream().collect(Collectors.groupingBy(User::getAddress));

		// Create a new stream and limit the result
		groupByUsers = groupByUsers.entrySet().stream().limit(N)
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		
		System.out.println(groupByUsers);	

	}

}
