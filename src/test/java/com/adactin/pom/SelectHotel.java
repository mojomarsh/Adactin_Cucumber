package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement rad_btn;
	
	@FindBy(xpath = "(//input[@value='Continue'])")
	private WebElement cont;

	public WebElement getRad_btn() {
		return rad_btn;
	}

	public WebElement getCont() {
		return cont;
	}


public SelectHotel(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	// TODO Auto-generated constructor stub
}
}
