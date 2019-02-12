package com.json.writer;

public class User {

	private String name;
	private Long age;
	
	public User() {
	}
	public User(String name, Long age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Long getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Long age) {
		this.age = age;
	}
	
}
