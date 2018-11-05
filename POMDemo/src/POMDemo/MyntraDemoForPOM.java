package POMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyntraDemoForPOM {
	
	By men=By.xpath(".//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/a");
	By CS=By.xpath(".//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/div/div/ul[1]/li[3]/a");
	@Test
	void LoginFB()
	
	{
		System.setProperty("webdriver.chrome.driver","F:\\JavaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe" );
		   WebDriver dr=new ChromeDriver();
		   dr.get("https://www.myntra.com/");
		   //dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("test");
		   //dr.findElement(men).click();
		   Actions obj=new Actions(dr);
		   obj.moveToElement(dr.findElement(men)).build().perform();
		   dr.findElement(CS).click();
		   
	
	}
}
