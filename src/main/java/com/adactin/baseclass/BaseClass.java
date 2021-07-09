package com.adactin.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Arockiaraj Gali\\eclipse-workspace\\Adactin_project\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Arockiaraj Gali\\eclipse-workspace\\SeleniumConcept\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			} else if (browserName.equalsIgnoreCase("gecko")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Arockiaraj Gali\\eclipse-workspace\\SeleniumConcept\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else {
				System.out.println("Invalid Bowser Name");
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputToElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void selectDropDown(WebElement element, String value, String option) {
		try {
			if (option.equalsIgnoreCase("byvalue")) {
				Select m = new Select(element);
				m.selectByValue(value);			
			}else if (option.equalsIgnoreCase("byvisibletext")) {
				Select y = new Select(element);
				y.selectByVisibleText(value);
				
			}else if (option.equalsIgnoreCase("byindex")) {
				Select d = new Select(element); 
				d.selectByIndex(Integer.parseInt(value));
				
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	
		
	}
	public static void clearOnElement(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	


