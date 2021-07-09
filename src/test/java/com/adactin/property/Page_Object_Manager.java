package com.adactin.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Loginpage;

public class Page_Object_Manager {
	public static WebDriver driver;
	
	private Loginpage login;

	public Page_Object_Manager(WebDriver Ldriver) {
		this.driver = Ldriver;
		PageFactory.initElements(Ldriver, this);
	}
	
	public Loginpage getInstanceLogin() {
		login = new Loginpage(driver);
		return login;
	}

}
