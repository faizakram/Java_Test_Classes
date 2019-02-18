package com.st.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MapFilter {

	public static void main(String k[]) {
		List<User> users = new ArrayList<>();
		/*
		 * List<User> users = new ArrayList<>(); List<Map> map = new ArrayList<>();
		 * Map<String, Long> = new User user = new User(name, fname, mapObject)
		 */

		Optional<Map<String, Long>> mapObject = users.stream().map(m -> m.getMapObject()).findFirst().orElse(null)
				.stream().sequential().filter(f -> f.get("k").equals(1l)).findFirst();

	}
}
