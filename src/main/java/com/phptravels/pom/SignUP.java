package com.phptravels.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUP {

	@FindBy(xpath = "(//*[local-name()='svg']//ancestor::li)[3]")
	private WebElement account;

	@FindBy(xpath = "//a[text()=' Signup ']")
	private WebElement signupDropDownbtn;

	public WebElement getSignupDropDownbtn() {
		return signupDropDownbtn;
	}

	public WebElement getAccount() {
		return account;
	}

	public void setAccount(WebElement account) {
		this.account = account;
	}

	@FindBy(id = "firstname")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(xpath = "//div[@class=\"filter-option\"]")
	private WebElement country;

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getCountry() {
		return country;
	}

	public void setCountry(WebElement country) {
		this.country = country;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getCapcha() {
		return capcha;
	}

	public void setCapcha(WebElement capcha) {
		this.capcha = capcha;
	}

	@FindBy(xpath = "//input[@type=\"search\"]")
	private WebElement countrySerch;

	@FindBy(xpath = "//span[contains(text(),' India ')]//strong//ancestor::span[@class=\"text\"]")
	private WebElement countrySerchClick;

	public WebElement getCountrySerchClick() {
		return countrySerchClick;
	}

	public void setCountrySerchClick(WebElement countrySerchClick) {
		this.countrySerchClick = countrySerchClick;
	}

	public WebElement getCountrySerch() {
		return countrySerch;
	}

	@FindBy(id = "submitBTN")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	@FindBy(id = "phone")
	private WebElement phone;

	@FindBy(id = "user_email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//span[@id='recaptcha-anchor']")
	private WebElement capcha;

	public SignUP(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
