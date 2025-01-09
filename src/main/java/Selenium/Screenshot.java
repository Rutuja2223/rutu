package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		WebElement ele = driver.findElement(By.xpath("//img[@class=\"_97vu img\"]"));
		
		TakesScreenshot scr = (TakesScreenshot)ele;
		
		File src = scr.getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make();
		
		File dest = new File("C:\\Users\\10824355\\OneDrive - LTIMindtree\\Desktop\\Screenshot\\"+Random+".PNG");
		
		FileHandler.copy(src,dest);
		
		//Thread.sleep(100);
		
		driver.close();
	}

}
