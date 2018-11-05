package POMDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

public class dataproviderreaddatafromexcel
     
{
		By un=By.xpath("//input[@name='email']");
		By psw=By.xpath(".//*[@id='pass']");
		By loginbt=By.xpath(".//*[@id='u_0_3']");
		
		@Test(dataProvider="Saravanan")
		public void LoginFB(String uname,String pass)
		
		{
			System.setProperty("webdriver.chrome.driver","F:\\JavaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe" );
			   WebDriver dr=new ChromeDriver();
			   dr.get("https://www.facebook.com");
			   screenshotcapture.takescreen(dr,"fbopen");
			   dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("test");
			   dr.findElement(un).sendKeys(uname);
			   screenshotcapture.takescreen(dr,"fbusername");
			   
			   dr.findElement(psw).sendKeys(pass);
			   screenshotcapture.takescreen(dr,"Fbpanssword");
			   dr.findElement(loginbt).click();
			   screenshotcapture.takescreen(dr,"fbloginnotworking"+ "");
			
		}

		@DataProvider(name="Saravanan")
		public Object[][] mydataprovider() throws JXLException, Exception
		{
			File inputfile = new File("F:\\JavaSelenium\\inputdata\\inputdata.xls");
			Workbook wb=Workbook.getWorkbook(inputfile);
			Sheet wsheet=wb.getSheet(0);
			int rowcount=wsheet.getRows();
						int columncount=wsheet.getColumns();
			
			String[][] ipdata=new String[rowcount][columncount];
			for(int i=0;i<rowcount;i++)
			{
				for (int j=0;j<columncount;j++)
				{
					Cell cellvalue=wsheet.getCell(j,i);
					ipdata[i][j]=cellvalue.getContents();
					
					
				}
				
			}
			return ipdata;
			
			
		}
			
	}



