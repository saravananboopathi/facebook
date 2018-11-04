package goodmorning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class haveagreatday {
	@Test
	void date1()
	{
		System.setProperty("webdriver.chrome.driver","F:\\JavaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe" );
		   WebDriver dr=new ChromeDriver();
		   dr.get("https://www.facebook.com/");
		   dr.manage().window().maximize();
		  dr.findElement(By.id("email")).sendKeys("saravananboopathi97@gmail.com");
		 dr.findElement(By.id("pass")).sendKeys("saravanan200655");
		 dr.findElement(By.id("u_0_2")).click();

	
	}
	
	

}
