package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.qa.Util.Util;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Base()
	{
		prop = new Properties();
		FileInputStream ip;
		try
		{
			ip = new FileInputStream("C:\\Users\\Manoj.Ashrit\\eclipse-workspace\\AutomationTestRun\\src\\main\\java\\com\\qa\\configuration\\config");
			try
			{
				prop.load(ip);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj.Ashrit\\Documents\\Work\\Documents\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("FF"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj.Ashrit\\Documents\\Work\\Documents\\ChromeDriver\\chromedriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
		//https://rahulshettyacademy.com/dropdownsPractise/
		//https://www.cleartrip.com/
	}
	
	

}
