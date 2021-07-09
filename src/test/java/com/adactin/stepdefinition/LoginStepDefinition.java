package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.Loginpage;
import com.adactin.property.File_Reader_Manager;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class LoginStepDefinition extends BaseClass {
	
	public static WebDriver driver = Runner.driver;
	
	//Loginpage lp = new Loginpage(driver);
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^User launches the adactin application$")
	public void user_launches_the_adactin_application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		
		geturl(url);
	   
	}

	@When("^User enters the valid username$")
	public void user_enters_the_valid_username() throws Throwable {
		String username = File_Reader_Manager.getInstance().getInstanceCR().getUsername();
		
		inputToElement(pom.getInstanceLogin().getUsername(), username);
	    
	}

	@When("^User enters the valid password$")
	public void user_enters_the_valid_password() throws Throwable {
		
		inputToElement(pom.getInstanceLogin().getPassword(), "123456");
	
	}

	@Then("^User validates the username and password$")
	public void user_validates_the_username_and_password() throws Throwable {
		
		clickOnElement(pom.getInstanceLogin().getLogin_btn());
	    
	}

}
