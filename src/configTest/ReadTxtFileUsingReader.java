package configTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxtFileUsingReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String Location="E:\\SOFTWARE\\SELENIUM\\AUTOMATION\\Udemy_Java\\newText.txt";
		
		File f=new File(Location);
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String Line=null;
		while((Line=br.readLine())!=null) {
			
			System.out.println(Line);
			
		}
		
br.close();
	}

}
