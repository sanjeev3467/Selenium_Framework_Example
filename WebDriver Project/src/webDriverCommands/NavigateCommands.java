package webDriverCommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/"); //navigate to new mercury tours website
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();//navigate to previous website
		System.out.println(driver.getTitle());
		driver.navigate().forward();//navigate to to forward page
		System.out.println(driver.getTitle());
		driver.navigate().refresh();//refresh the current page
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
