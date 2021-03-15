package pageOjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagefactElement {
	
	WebDriver driver;
	
	
	By uname=By.name("userName");
	By pwd=By.name("password");
	By signbtn=By.name("submit");
	
	public PagefactElement(WebDriver d) {
		
		driver=d;
	}
	
	public void setUsername(String unmedata){
		
		driver.findElement(uname).sendKeys(unmedata);
	}
	
	public void setPassword(String pwddata){
		
		driver.findElement(pwd).sendKeys(pwddata);
	}

	public void submit() {
		
		driver.findElement(signbtn).click();
	}
}
