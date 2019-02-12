package com.st.excel.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private ExcelUtils() {
	}

	@SuppressWarnings("resource")
	public static Map<String, XSSFSheet> getSheetsName(FileInputStream file) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Map<String, XSSFSheet> sheets = new HashMap<>();
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			sheets.put(workbook.getSheetAt(i).getSheetName(), workbook.getSheetAt(i));
		}
		return sheets;
	}

	public static Map<Integer, List<Object>> readSheet(XSSFSheet xssfSheet) {
		Map<Integer, List<Object>> data = new TreeMap<>();
		for (Row row : xssfSheet) {
			List<Object> list = new ArrayList<>();
			for (Cell cell : row) {
				list.add(cell);
			}
			data.put(row.getRowNum(), list);
		}
		return data;
	}

	public static List<String[]> readSheetArray(XSSFSheet xssfSheet) {
		List<String[]> list = new ArrayList<>();
		for (Row row : xssfSheet) {
			String[] cellArray = new String[row.getPhysicalNumberOfCells()];
			for (Cell cell : row) {
				cellArray[cell.getColumnIndex()] = cell.toString();
			}
			list.add(cellArray);
		}
		return list;
	}

}
