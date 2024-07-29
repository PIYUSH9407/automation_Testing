package demoasp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class reading_text_file {
	public static void main(String[] args) throws IOException {
		String fpath="C:\\Users\\webner\\Desktop\\read.text";
		
		BufferedReader bf=new BufferedReader(new FileReader(fpath));
		String startline;
		while((startline=bf.readLine()) != null) {
			System.out.println(startline);
			
		}
			
	}

	
}
			
			
				
		
		
		
			


