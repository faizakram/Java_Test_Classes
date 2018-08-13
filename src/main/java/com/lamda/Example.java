package com.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	private Integer Id;
	private String name;
	private String city;
	private long salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [Id=");
		builder.append(Id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", city=");
		builder.append(city);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	public Employee(Integer id, String name, String city, long salary) {
		super();
		Id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}

class CompartorExmaple implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}

}

class User {
	private int id;
	private String name;
	private int age;

	public User(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		list.add(new User(1, "Dinesh", 20));
		list.add(new User(2, "Kamal", 15));
		list.add(new User(3, "Vijay", 25));
		list.add(new User(4, "Dinesh", 30));
		list.add(new User(5, "Dinesh", 18));
		return list;
	}
}

public class Example {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(95, 53, 24, 10);
		// numbers.sort(Comparator.reverseOrder());
		Map<Integer, Integer> map1 = numbers.stream().collect(Collectors.toMap(i -> i, i -> numbers.indexOf(i))).
				entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println(map1);
		/*List<User> users = User.getUsers();
		Map<Integer, String> map = users.stream().collect(Collectors.toMap(User::getId, User::getName));
		System.out.println(map);*/
		/*
		 * Key: 100, value: Mohan, Sohan Key: 300, value: Mahesh
		 */

	}

}
