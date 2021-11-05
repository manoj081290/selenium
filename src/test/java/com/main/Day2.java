package com.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {

	static WebDriver driver;
	
	@BeforeClass
	public static void launchbrowser()
	
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
	}
	
	    @AfterClass
		public static void closeBrowser()
		{
	    	driver.close();
		
	}
	    @Before
	    public void openAppllication()
	    {
	    	
	    	driver.get("https://opensource-demo.orangehrmlive.com/");
	    	driver.manage().window().maximize();
	    }
	
	    @Test
	    public void action2()
	    {
	    WebElement user = driver.findElement(By.id("txtUsername"));
	    user.sendKeys("Admin");
	    WebElement pass = driver.findElement(By.id("txtPassword"));
	    pass.sendKeys("admin123");
	    WebElement login = driver.findElement(By.id("btnLogin"));
	    login.click();
	  	
}
	    
	    @Test
	    public void action1()
	    {
	    WebElement user = driver.findElement(By.id("txtUsername"));
	    user.sendKeys("Admin");
	    WebElement pass = driver.findElement(By.id("txtPassword"));
	    pass.sendKeys("admin123");
	    WebElement login = driver.findElement(By.id("btnLogin"));
	    login.click();
	  	
}
	    @After
	    public void validation()
	    
	    {
	    	WebElement wel = driver.findElement(By.id("welcome"));
	    	String text = wel.getText();
	    	boolean contains = text.contains("Welcome");
	    	Assert.assertTrue(contains);
	    	Assert.assertEquals("Welcome", text);
	    }
	    	
	    	
	    }
