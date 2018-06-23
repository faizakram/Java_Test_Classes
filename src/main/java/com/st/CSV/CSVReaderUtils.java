package com.st.CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderUtils {



	public static List<UserModel> convertCSVToUserModel(String path) {
		 BufferedReader br = null;
	     String line = "";
	     List<UserModel> userList = new ArrayList<UserModel>();
		try {
			 br = new BufferedReader(new FileReader(path));
	            while ((line = br.readLine()) != null) {
	                String[] data = line.split(CommonConstants.COMMA);
	                UserModel user = new UserModel();
	                user.setCountry(data[0]);
	                user.setCity(data[1]);
	                switch(data[2])
	                {
	                case CommonConstants.MALE:
	                	user.setGender(Gender.Male);
	                	 break;
	                case CommonConstants.FEMALE:
	                	user.setGender(Gender.FeMale);
	                	 break;
	                default:
	                	user.setGender(Gender.Other);
	                }
	                user.setSalary(Double.parseDouble(data[3]));
	                userList.add(user);
	            }
	        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}
	

}
	
