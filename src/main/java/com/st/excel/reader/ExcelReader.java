package com.st.excel.reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelReader {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(new File("E:\\learning\\ExcelReader\\MyExcel.xlsx"));
			Map<String, XSSFSheet> sheets = ExcelUtils.getSheetsName(file);
			sheets.forEach((key, value) -> {
			System.out.println(key +"============== key Sheet=================");
			
			List<String[]> listArray = ExcelUtils.readSheetArray(value);
			listArray.forEach(e -> System.out.println(e));
			/*Map<Integer, List<Object>> data = ExcelUtils.readSheet(value);
			data.forEach((key1, value2) -> {
				System.out.println("Key : " + key1 + " Value : " + value2);
			});*/
			
			});
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
