package mavn.Selenium.utilies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class PropertyUtil {

	public static String getProperty(String Key) {
		Properties propVal = new Properties();
		
		try {
			propVal.load(new FileInputStream("./config.properties"));
			String ref = propVal.getProperty(Key);
			return ref;			
			
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
