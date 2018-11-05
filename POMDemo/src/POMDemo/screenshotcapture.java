package POMDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class screenshotcapture {
 public static void takescreen(WebDriver driver,String pagename)
 {
 try {
	TakesScreenshot tt=(TakesScreenshot)driver;
	 File src=tt.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(src,new File("C:\\saravanan\\screenshot\\"+pagename+".png"));
} catch (Exception e) {
	
	e.printStackTrace();
} 
 }
}

