package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/"); //navigate to new mercury tours website


		WebElement user=driver.findElement(By.name("userName"));
		
		if(user.isDisplayed() && user.isEnabled()){
			
			driver.findElement(By.name("userName")).sendKeys("mercury");
			System.out.println("elemnt  enabled and displayed");
			
		} else {
			
			System.out.println("elemnt not enabled and displayed");
		}
		
		driver.close();
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.ironspider.ca/forms/checkradio.htm");
		System.out.println(driver1.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]")).isSelected());;
		
		
		if((driver1.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]")).isSelected()==false)) {
			
			driver1.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]")).click();
			
		
		
		
		}
		
		driver1.close();
	}

}
