package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class SelectHotelStepDef extends BaseClass{
	
	public static WebDriver driver = Runner.driver; 
	
	SelectHotel sh2 = new SelectHotel(driver);
	
	
	@When("^User selects the Hotel$")
	public void user_selects_the_Hotel() throws Throwable {
		clickOnElement(sh2.getRad_btn());
	    
	}

	@Then("^User clicks continue$")
	public void user_clicks_continue() throws Throwable {
		clickOnElement(sh2.getCont());
	    
	}

}
