package com.phptravels.Steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.phptravels.baseclass.BaseClass;
import com.phptravels.helper.FileReadManager;
import com.phptravels.pom.SignUP;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class flightBookinSteps extends BaseClass {
	public WebDriver driver = Hooks.driver;

	@Given("user able to successfully booking confirmation")
	public void user_able_to_successfully_booking_confirmation() {
		
	}

	@When("user Perform a flight search by entering  {string} and {string}")
	public void user_perform_a_flight_search_by_entering_and(String string, String string2) {
		

	}

	@When("user select the calender in {string}")
	public void user_select_the_calender_in(String string) {
		

	}

	@When("user clicks on the search button")
	public void user_clicks_on_the_search_button() {
		

	}

	@Then("user able to see the search results")
	public void user_able_to_see_the_search_results() {
		

	}

	@When("user enters the passenger name")
	public void user_enters_the_passenger_name() {
		

	}

	@When("user enters the passenger email")
	public void user_enters_the_passenger_email() {
		

	}

	@Then("user booking confirmation is displayed")
	public void user_booking_confirmation_is_displayed() {
		

	}

}