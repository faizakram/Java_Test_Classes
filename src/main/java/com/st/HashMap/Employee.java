package com.st.HashMap;

public class Employee {

	private Integer id;
	private String name;
	private Integer age;

	public Employee(Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee emp = (Employee) obj;
		if (id != emp.id)
			return false;
		if(name != emp.name)
			return false;
		if(age != emp.age)
			return false;
		return true;
	}

	@Override public int hashCode() { 
		int result = id ^ (id >>> 32);
		result = 31* result + (name!=null?name.hashCode():0); 
		result = 31 * result + (age!=null?age.hashCode():0); 
		return result; 
		}

}
