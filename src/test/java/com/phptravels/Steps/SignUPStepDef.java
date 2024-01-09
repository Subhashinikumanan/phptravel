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

public class SignUPStepDef extends BaseClass {
	public WebDriver driver = Hooks.driver;

	SignUP s = new SignUP(driver);

	@Given("User able to  launch the phptravels application")
	public void user_able_to_launch_the_phptravels_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String url = FileReadManager.getInstance().getCr().getUrl();

		getUrl(url);

		Thread.sleep(4000);
		clickonWebelement(s.getAccount());
		System.out.println("click doen");
		clickonWebelement(s.getSignupDropDownbtn());
	}

	@When("User enter the {string}  firstname in Sign Up Page")
	public void user_enter_the_firstname_in_sign_up_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		inputValuestoWebelement(s.getFirstname(), string);
	}

	@When("User enter the {string}  lastname in Sign Up Page")
	public void user_enter_the_lastname_in_sign_up_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		inputValuestoWebelement(s.getLastname(), string);
	}

	@When("User select  the {string} dropdown in Sign Up Page")
	public void user_select_the_dropdown_in_sign_up_page(String string) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		clickonWebelement(s.getCountry());

		Thread.sleep(4000);
		inputValuestoWebelement(s.getCountrySerch(), string);
		Thread.sleep(4000);
		clickonWebelement(s.getCountrySerchClick());

	}

	@When("User enter the {string} phone  in Sign Up Page")
	public void user_enter_the_phone_in_sign_up_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		inputValuestoWebelement(s.getPhone(), string);
	}

	@When("User enter the {string} emailaddress in Sign Up Page")
	public void user_enter_the_emailaddress_in_sign_up_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		inputValuestoWebelement(s.getEmail(), string);
	}

	@When("User enter the {string} password in Sign Up Page")
	public void user_enter_the_password_in_sign_up_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		inputValuestoWebelement(s.getPassword(), string);
	}

	@When("User Click the capcha Button  in Sign Up Page")
	public void user_click_the_capcha_button_in_sign_up_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(4000);
		clickonWebelement(s.getCapcha());
	}

	@When("User Click the Sign Up Button  in Sign Up Page")
	public void user_click_the_sign_up_button_in_sign_up_page() {
		// Write code here that turns the phrase above into concrete actions

		clickonWebelement(s.getSubmit());
	}

	@Then("User Verify the user is naviogated to signup success page with {string} displayed in the header")
	public void user_verify_the_user_is_naviogated_to_signup_success_page_with_displayed_in_the_header(String string) {
		// Write code here that turns the phrase above into concrete actions

	}

}