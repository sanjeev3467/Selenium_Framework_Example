package basics;

//below import options are packages for firefoxdriver, webdriver interface, By
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Selenium Files\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/"); //navigate to new mercury tours website
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		String Exp_Title="Login: Mercury Tours";
		
		String Act_Title=driver.getTitle();// it will return the actual title of the page
		
		System.out.println("Title is ---->"+Act_Title);
		
		if(Exp_Title.contentEquals(Act_Title)) {
			
			System.out.println("Test Pass");
			
		} else {
			System.out.println("Test Failed");
		}
		
		driver.close();

	}

}
