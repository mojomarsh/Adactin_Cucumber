package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.BookHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class BookHotelStepDef extends BaseClass{
	
	public static WebDriver driver = Runner.driver;
	
	BookHotel bh = new BookHotel(driver);
	
	@When("^User enters the first name$")
	public void user_enters_the_first_name() throws Throwable {
		inputToElement(bh.getFirstname(), "marshal");
	    
	}

	@When("^User enters the last name$")
	public void user_enters_the_last_name() throws Throwable {
		inputToElement(bh.getLastname(), "bharath");
	   
	}

	@When("^User enters the billing address$")
	public void user_enters_the_billing_address() throws Throwable {
		inputToElement(bh.getAddress(), "4,Annai Nagar,Chennai");
	    
	}

	@When("^user enters the credit card number$")
	public void user_enters_the_credit_card_number() throws Throwable {
		inputToElement(bh.getCcnumb(), "1234 5678 8765 4321");
	    
	}

	@When("^User selects the credit card type$")
	public void user_selects_the_credit_card_type() throws Throwable {
		selectDropDown(bh.getCctype(), "American Express", "byvisibletext");
	   
	}

	@When("^User selects the expiry month$")
	public void user_selects_the_expiry_month() throws Throwable {
		selectDropDown(bh.getExpmonth(), "5", "byvalue");
	    
	}

	@When("^User selects the expiry year$")
	public void user_selects_the_expiry_year() throws Throwable {
		selectDropDown(bh.getExpyear(), "2022", "byvalue");
	  
	}

	@When("^User enters the cvv number$")
	public void user_enters_the_cvv_number() throws Throwable {
		inputToElement(bh.getCvvnumb(), "777");
	  
	}

	@Then("^User clicks book now$")
	public void user_clicks_book_now() throws Throwable {
		clickOnElement(bh.getBooknow());
	    
	}

}
