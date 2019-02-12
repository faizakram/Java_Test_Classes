package com.st.CSV;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVReader;

public class OpenCSVReader {

	public static List<String[]> readAll(Reader reader) throws Exception {
		CSVReader csvReader = new CSVReader(reader);
		 List<String[]> list = csvReader.readAll();
		reader.close();
		csvReader.close();
		return list;
	}

	public static void main(String k[]) throws Exception {
		Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\13615\\Downloads\\Import CSV\\Client_Product_Import.csv"));
		for(String [] arc: OpenCSVReader.readAll(reader)) {
			System.out.println(arc[5]);
		}
		System.out.println(OpenCSVReader.readAll(reader).toString());
	}
}
