package BaseLayer;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass 
{
	protected static Properties prop;
	public static FileInputStream fis;
	protected static WebDriver driver;
	
	
	public static void initialization()
	{
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(45));
		 String url=prop.getProperty("URL");
		 driver.get(url);
	}
	public BaseClass()
	{
		 prop=new Properties();
		 String path=System.getProperty("user.dir")+"/src/main/java/Configuration/Config.properties";
		 try
		 {
			  fis=new FileInputStream(path);
			  prop.load(fis);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}
	
//	public static void main(String[] args) 
//	{
//		BaseClass obj1=new BaseClass();
//		obj1.initialization();
//	}
}
