package conf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practical2 {

	public static void main(String[] args) {
		filedoes();

	}
	public static void filedoes() {
		
		
		try {
			String path = "conf.properties";
			File f = new File(path);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			try {
				while((line=br.readLine())!=null  ) {
					System.out.println(line);
					System.out.println(" ");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
