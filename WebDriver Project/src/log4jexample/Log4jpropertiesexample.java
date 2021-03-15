package log4jexample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jpropertiesexample {

	public static void main(String[] args) {

		 Logger logger=Logger.getLogger("Log4jpropertiesexample");
		 PropertyConfigurator.configure("log4j.properties");
         System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		//Chrome browser launching
		ChromeDriver driver=new ChromeDriver();
		
		logger.info("browser launch");
	  	driver.get("http://demo.guru99.com/test/newtours/");
		logger.info("URL Launched");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		logger.info("Entered User Name");
		driver.findElement(By.name("password")).sendKeys("mercury");
		logger.info("Entered Password");
		driver.findElement(By.name("submit")).click();
		logger.info("Login successfully");
		
		driver.close();
		logger.info("Browser Closed");

	}

}
