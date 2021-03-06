package com.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx5_N {
	public static void main(String[] args) {
		// commendline에서 inputfile을 지정해주지 않으면 프로그램을 종료한다.
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("output.txt"));
		} catch (IOException e) {
			System.out.println("지정된 파일을 찾을 수 없습니다.");
			System.exit(0);
		}
		System.out.println(prop);
		
		Enumeration en = prop.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
