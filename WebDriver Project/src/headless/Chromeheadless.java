package headless;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeheadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		//Chrome options for donot launching the browser and run with headless
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		System.out.println("Title of page-->"+driver.getTitle());

	}

}
