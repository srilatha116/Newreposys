/**
 * @author Srilatha
 */
package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author srilata
 *
 */
public class Configdataprovider {
	Properties pro=new Properties();
	public  Configdataprovider() throws Exception
	{
	File scr=new File("C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\Config.properties");
	FileInputStream fis=new FileInputStream(scr);
	Properties pro=new Properties();
	pro.load(fis);
	
	}
			
	
	public String geturl()
	{
		return pro.getProperty("URL");
	}
}
