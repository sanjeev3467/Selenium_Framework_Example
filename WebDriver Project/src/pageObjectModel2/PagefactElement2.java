package pageObjectModel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagefactElement2 {
	
	WebDriver driver;
	
	//way of writing1
	//@FindBy(how=How.NAME,using="userName")
	//WebElement uname;
		
	@FindBy(name="userName")
	WebElement uname;
		
	//way of writing2
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(name="submit")
	WebElement signbtn;
	
	public PagefactElement2(WebDriver d) {
		
		driver=d;
		
		PageFactory.initElements(d, this);
	}
	
	public void setUsername(String unmedata){
		
		uname.sendKeys(unmedata);
	}
	
	public void setPassword(String pwddata){
		
		pwd.sendKeys(pwddata);
	}

	public void submit() {
		
		signbtn.click();
	}
}
