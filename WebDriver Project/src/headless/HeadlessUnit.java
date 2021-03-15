package headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		System.out.println("Title is--->"+driver.getTitle());
		System.out.println("Url is----->"+driver.getCurrentUrl());

	}

}
