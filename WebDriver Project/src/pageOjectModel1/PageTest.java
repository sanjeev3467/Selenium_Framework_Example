package pageOjectModel1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageTest {
	
	@Test
	public void LoginPage() {
		
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		PagefactElement p1=new PagefactElement(driver);
		
		p1.setUsername("mercury");
		p1.setPassword("mercury");
		p1.submit();
		
		if(driver.getPageSource().contains("Login Successfully")) {
			
			System.out.println("Login Successfully");
			
		} else {
			
			System.out.println("Login failed");
		}
		
		
		driver.close();
	}

	
}
