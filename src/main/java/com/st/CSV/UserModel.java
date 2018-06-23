package com.st.CSV;

public class UserModel {

	private String country;
	private String city;
	private Gender gender;	
	private Double salary;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "UserModel [country=" + country + ", city=" + city + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
	

}
