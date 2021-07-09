package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(name = "room_type")
	private WebElement room;
	
	@FindBy(name = "room_nos")
	private WebElement roomnumber;
	
	@FindBy(id = "datepick_in")
	private WebElement checkin;	
	
	
	@FindBy(name = "datepick_out")
	private WebElement checkout;
	
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	
	@FindBy(name = "child_room")
	private WebElement childroom;
	
	@FindBy(id = "Submit")
	private WebElement search_btn;
	
	public SearchHotel(WebDriver driver2) { 
		this.driver = driver2;
	  PageFactory.initElements(driver, this); 
	  }
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomnumber() {
		return roomnumber;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

	
	  
	  
	
}
