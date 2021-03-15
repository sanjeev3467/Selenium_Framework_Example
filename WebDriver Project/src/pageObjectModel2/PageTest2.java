package pageObjectModel2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageTest2 {
	
	@Test
	public void LoginPage() {
		
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		PagefactElement2 p2=new PagefactElement2(driver);
		
		
		p2.setUsername("mercury");
		p2.setPassword("mercury");
		p2.submit();
		
		if(driver.getPageSource().contains("Login Successfully")) {
			
			System.out.println("Login Successfully");
			
		} else {
			
			System.out.println("Login failed");
		}
		
		
		driver.close();
	}

	
}
