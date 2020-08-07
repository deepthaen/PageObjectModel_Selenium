package mavn.Selenium.utilies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propty {
	
	public static String propValue(String val) {
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream("./config.properties"));
			String ref = pro.getProperty(val);
			return val;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return null;
		
	}

}
