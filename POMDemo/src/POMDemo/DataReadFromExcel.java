package POMDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataReadFromExcel {
	
	By un=By.xpath("//input[@name='email']");
	By psw=By.xpath(".//*[@id='pass']");
	By loginbt=By.xpath(".//*[@id='u_0_3']");
	
	@Test(dataProvider="Saravanan")
	public void fbLogin(String uname, String pass)
	{
		   System.setProperty("webdriver.chrome.driver","F:\\JavaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe" );
		   WebDriver dr=new ChromeDriver();
		   dr.get("https://www.facebook.com");
		   dr.findElement(un).sendKeys(uname);
		   dr.findElement(psw).sendKeys(pass);
		   dr.findElement(loginbt).click();
	}
	
	@DataProvider(name="Saravanan")
	public Object[][] mydataprovider() throws JXLException, Exception
	{
		File inputfile = new File("F:\\JavaSelenium\\inputdata\\inputdata.xls");
		Workbook wb=Workbook.getWorkbook(inputfile);
		
		
	}

}
