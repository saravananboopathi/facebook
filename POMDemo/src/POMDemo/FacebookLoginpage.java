package POMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginpage {
	
	By un=By.xpath("//input[@name='email']");
	By psw=By.xpath(".//*[@id='pass']");
	By loginbt=By.xpath(".//*[@id='u_0_3']");
	
	@Test(dataProvider="myuserdetails")
	void LoginFB(String uname,String pass)
	
	{
		System.setProperty("webdriver.chrome.driver","F:\\JavaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe" );
		   WebDriver dr=new ChromeDriver();
		   dr.get("https://www.facebook.com");
		   screenshotcapture.takescreen(dr,"fbopen");
		   //dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("test");
		   dr.findElement(un).sendKeys(uname);
		   screenshotcapture.takescreen(dr,"fbusername");
		   
		   dr.findElement(psw).sendKeys(pass);
		   screenshotcapture.takescreen(dr,"Fbpassword");
		   dr.findElement(loginbt).click();
		   screenshotcapture.takescreen(dr,"fbloginnotworking"+ "");
		
	}

	@DataProvider(name="myuserdetails")
	public Object[][] pageData()
	{
	Object[][] data=new Object[3][2];
		data[0][0]="user1";
		data[0][1]="password";
	
		data[1][0]="user2";
		data[1][1]="password";
	 
		data[2][0]="user2";
	data[2][1]="password";
	return data;	
	}
	
}
