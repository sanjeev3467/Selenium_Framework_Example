package webDriverCommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");//Redirect to the url
		
		driver.close();//close current window of browser
		driver.quit();//close all child windows of browser
	}

}
