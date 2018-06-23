package com.st.DeleteFile;

import java.io.File;
import java.util.Scanner;

public class DeleteFileWithWarring {
	private Scanner input = new Scanner(System.in);

	public void deleteFile(String filename) {
		File file = new File(filename);

		if (file.exists()) {
			System.out.println("Press Y or N");
			String str = input.nextLine();
			switch (str) {
			case "Y":
				file.delete();
				System.out.println("File Deleted");
				break;
			default:
				System.out.println("You have pressed N, So file can not be Deleted");

			}
		} else {
			System.out.println("File Not Found");
		}
	}
	
	public static void main(String[] args) {
		String file = "C:\\Users\\13615\\Documents\\aaa.txt";
		DeleteFileWithWarring dfw = new DeleteFileWithWarring();
		dfw.deleteFile(file);
	}
		

}
