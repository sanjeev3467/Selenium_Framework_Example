package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class firefoxheadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Selenium Files\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		
		//Firefox options for donot launching the browser and run with headless
		
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		
		WebDriver driver=new FirefoxDriver(options);
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		System.out.println("Title of page-->"+driver.getTitle());

	}

}
