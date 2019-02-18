package com.st.filter;

import java.util.List;
import java.util.Map;

public class User {
	
	private String name;
	private String fname;
	List<Map<String,Long>> mapObject;
	
	
	public User(String name, String fname, List<Map<String, Long>> mapObject) {
		super();
		this.name = name;
		this.fname = fname;
		this.mapObject = mapObject;
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
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the mapObject
	 */
	public List<Map<String, Long>> getMapObject() {
		return mapObject;
	}
	/**
	 * @param mapObject the mapObject to set
	 */
	public void setMapObject(List<Map<String, Long>> mapObject) {
		this.mapObject = mapObject;
	}
	
	

}
