package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class loadProperities {
	
	
	public static Properties userData= loadProperties(System.getProperty("user.dir")+"\\src\\main\\java\\properities\\userData.properities");
		
		private static Properties loadProperties(String path) {
			
			Properties prooperitiesOBJ= new Properties();
			
			FileInputStream stream;
			try {
				stream = new FileInputStream(path);
				prooperitiesOBJ.load(stream);
			} catch (FileNotFoundException e) {
				System.out.println("Errpr..!"+ e.getMessage());
			}
			 catch (IOException e) {
				// TODO Auto-generated catch block
				 System.out.println("Errpr..!"+ e.getMessage());
			}
			
			return prooperitiesOBJ;
			
			
			
			
			
		}
		
		
		
		
		
	

}
