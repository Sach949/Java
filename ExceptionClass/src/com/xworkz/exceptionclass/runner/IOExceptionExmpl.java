package com.xworkz.exceptionclass.runner;

import java.io.File;
import java.io.IOException;

public class IOExceptionExmpl {

	public static void main(String[] args) {

		try {
			File file = new File("");
			file.getPath();
			System.err.println(file.getName());
			file.createNewFile();
			System.exit(1);
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("Give correect path");
		}
	}

}