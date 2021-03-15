package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");//Redirect to the url
		
		System.out.println("Title...>"+driver.getTitle());//Return Title of the page
		
		System.out.println("Current URL....>"+driver.getCurrentUrl());//Returns the current URL of page
		
		String gettxt=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
		System.out.println("Text is...."+gettxt); //retrns the gettext
		
		driver.close();
		
	}

}
