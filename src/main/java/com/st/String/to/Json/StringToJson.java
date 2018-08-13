package com.st.String.to.Json;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

class User {
	private String name;
	private Integer age;

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
		return "User [name=" + name + ", age=" + age + "]";
	}
}

public class StringToJson {

	public JsonNode ConvertIntoJsonNode(String jsonStr) {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode rootNode = null;
		try {
			rootNode = objectMapper.readTree(jsonStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rootNode;
	}

	public List<User> convertIntoObject(String jsonStr) {
		ObjectMapper objectMapper = new ObjectMapper();
		User[] myObjects = null;
		try {
			myObjects = objectMapper.readValue(jsonStr, User[].class);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(myObjects);
	}

	public List<User> convertIntothirdway(String jsonStr) {
		ObjectMapper objectMapper = new ObjectMapper();
		List<User> userList = null;
		try {
			userList = objectMapper.readValue(jsonStr, new TypeReference<List<User>>() {
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}

	public List<User> convertInto4thway(String jsonStr) {
		ObjectMapper objectMapper = new ObjectMapper();
		List<User> userList = null;
		try {
			userList = objectMapper.readValue(jsonStr,
					objectMapper.getTypeFactory().constructCollectionType(List.class, User.class));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jsonStr = "[{\"name\":\"peter\",\"age\":40},{\"name\":\"laura\",\"age\":50}]";
		StringToJson StringToJson = new StringToJson();
		// System.out.println(Example.ConvertIntoJsonNode(jsonStr));
		// rootNode = objectMapper.readTree(jsonStr);

		System.out.println(StringToJson.convertIntoObject(jsonStr));

	}

}
