package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
			
			driver.findElement(By.name("firstname")).sendKeys("Rutuja");
			
			driver.findElement(By.name("lastname")).sendKeys("Panchal");
			
			WebElement day = driver.findElement(By.id("day"));
			
			WebElement month = driver.findElement(By.id("month"));
			
			WebElement year = driver.findElement(By.id("year"));
			
			Select D1 = new Select(day);
			
			D1.selectByValue("12");
			
			Select D2 = new Select(month);
			
			List <WebElement> M = D2.getOptions();
			
			for(int i = 0; i< M.size(); i++)
			{
				String Month = M.get(i).getText();
				
				if(Month.equals("Aug"))
				{
					M.get(i).click();
					break;
				}
			}
			
			Select S3 = new Select(year);
			
			List <WebElement> Y = S3.getOptions();
			
			for(int i=0; i<Y.size(); i++)
			{
				String Year = Y.get(i).getText();
				
				if(Year.equals("1991"))
				{
					Y.get(i).click();
					break;
				}
			}
			
			
			
	}

}
