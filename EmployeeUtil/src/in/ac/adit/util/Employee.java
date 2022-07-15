package in.ac.adit.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Employee {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(new File("D:\\data.csv"));
			BufferedReader bfr = new BufferedReader(fr);
			String mydata =null;
			try {
				while((mydata=bfr.readLine())!=null) {
					String data[] = mydata.split(",");
					System.out.println(data[3]);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
