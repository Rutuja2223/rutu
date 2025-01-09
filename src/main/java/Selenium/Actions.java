package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		int a[] = {1,2,3,4,5,2};
//		
//		String b = "Rutuja";
//		
//		String str = "Panchal";
//		
//		for(int i = 0; i<a.length; i++)
//		{
//			for(int j = i+1; j<a.length; j++)
//			{
//				if(a[i]==a[j])
//				{
//					System.out.println("Equal1");
//				}
//				else
//					System.out.println("1 Not Equal");
//			}
//			
//		}
//		
//		if(b.equals(str))
//		{
//			System.out.println("Equal2");
//		}
//		else
//			System.out.println("2 Not Equal");
//
//	}
//	
	String path = "C:\\Users\\10824355\\OneDrive - LTIMindtree\\Desktop\\data.xlsx";
	
	FileInputStream file = new FileInputStream(path);
	
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
 
	System.out.println(data);
	System.out.println(data);
}
}
