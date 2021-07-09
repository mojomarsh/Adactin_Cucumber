package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(name = "last_name")
	private WebElement lastname;
	
	@FindBy(name = "address")
	private WebElement address;
	
	
	@FindBy(id = "cc_num")
	private WebElement ccnumb;

	@FindBy(name = "cc_type")
	private WebElement cctype;

	@FindBy(name = "cc_exp_month")
	private WebElement expmonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expyear;
	
	@FindBy(name = "cc_cvv")
	private WebElement cvvnumb;
	
	@FindBy(id = "book_now")
	private WebElement booknow;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnumb() {
		return ccnumb;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnumb() {
		return cvvnumb;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	

	public BookHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	
	
	
	
	
}
