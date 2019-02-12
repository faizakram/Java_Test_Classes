package com.st.CSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Excel {

	public static final String COMMA = ",";

	public static Function<String, UserInfo> mapToItem = (line) -> {
		String[] p = line.split(COMMA);// a CSV has comma separated lines
		UserInfo item = new UserInfo();
		item.setFirstName(p[0]);// <-- this is the first column in the csv file
		if (p[2] != null && p[2].trim().length() > 0) {
			item.setLastName(p[2]);
		}
		// more initialization goes here
		return item;
	};

	public static void main(String[] args) {
		List<UserInfo> inputList = null;
		try {
			File inputF = new File("E:\\learning\\abc.csv");
			InputStream inputFS = new FileInputStream(inputF);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
			// skip the header of the csv
			inputList = br.lines().map(mapToItem).collect(Collectors.toList());
			br.close();
		} catch (IOException e) {
		}
		System.out.println(inputList);

	}

}
