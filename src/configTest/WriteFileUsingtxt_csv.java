package configTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileUsingtxt_csv{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 String location="newText.csv";
		
		File f =new File(location);
		FileWriter fw=new FileWriter(f);
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		for(int i=0;i<=4;i++)
		{
			for( int j=0;j<=3;j++)
			{
				int d=(int) (Math.random()*50);
				bw.write(d+",");
			}
			bw.newLine();
		}
		bw.close();
System.out.println("File Created !!!");
	}

}
