package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.SearchHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelStepDef extends BaseClass {
	
	public static WebDriver driver = Runner.driver;
	
	SearchHotel sh = new SearchHotel(driver);
	
	@When("^User selects the hotel location$")
	public void user_selects_the_hotel_location() throws Throwable {
		selectDropDown(sh.getLocation(), "Melbourne", "byvalue");	    
	}

	@When("^User selects the hotel$")
	public void user_selects_the_hotel() throws Throwable {
		selectDropDown(sh.getHotel(), "Hotel Sunshine", "byvalue");	    
	}

	@When("^User selects the room type$")
	public void user_selects_the_room_type() throws Throwable {
		selectDropDown(sh.getRoom(), "Super Deluxe", "byvalue");
	    
	}

	@When("^User selects number of rooms$")
	public void user_selects_number_of_rooms() throws Throwable {
		selectDropDown(sh.getRoomnumber(),"1", "byvalue");
	    
	}

	@When("^User clears the check-in date$")
	public void user_clears_the_check_in_date() throws Throwable {
		clearOnElement(sh.getCheckin());
	    
	}

	@When("^User enters the check-in date$")
	public void user_enters_the_check_in_date() throws Throwable {
		inputToElement(sh.getCheckin(), "30/06/2021");
	    
	}

	@When("^User clears the check-out date$")
	public void user_clears_the_check_out_date() throws Throwable {
		clearOnElement(sh.getCheckout());
	   
	}

	@When("^User enters the check-out date$")
	public void user_enters_the_check_out_date() throws Throwable {
		inputToElement(sh.getCheckout(), "07/07/2021");
	    
	}

	@When("^User enters adults per room$")
	public void user_enters_adults_per_room() throws Throwable {
	    selectDropDown(sh.getAdultroom(), "2", "value");
	}

	@When("^User enters children per room$")
	public void user_enters_children_per_room() throws Throwable {
		selectDropDown(sh.getChildroom(), "0 - None", "visibletext");
	   
	}

	@Then("^User clicks search$")
	public void user_clicks_search() throws Throwable {
		clickOnElement(sh.getSearch_btn());
	   
	}


}
