package configTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestConfig {
	
	public void newt() {
		
		
		
	}
	
	

	public static void main(String[] args) throws IOException {
		
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\configTest\\config.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(System.getProperty("user.dir"));
		
		
		
		

	}

}
