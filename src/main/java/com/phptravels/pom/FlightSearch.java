package com.phptravels.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSearch {

	@FindBy(xpath = "//label[text()='Flying From']")
	private WebElement flyingfrom;

	@FindBy(xpath = "//label[text()='Destination To']")
	private WebElement DestinationTo;

	public WebElement getFlyingfrom() {
		return flyingfrom;
	}

	public void setFlyingfrom(WebElement flyingfrom) {
		this.flyingfrom = flyingfrom;
	}

	public WebElement getDestinationTo() {
		return DestinationTo;
	}

	public void setDestinationTo(WebElement destinationTo) {
		DestinationTo = destinationTo;
	}

	public WebElement getSearchBTn() {
		return searchBTn;
	}

	public void setSearchBTn(WebElement searchBTn) {
		this.searchBTn = searchBTn;
	}

	public WebElement getDeparture() {
		return departure;
	}

	public void setDeparture(WebElement departure) {
		this.departure = departure;
	}

	@FindBy(xpath = "input[@type='search']")
	private WebElement searchBTn;

	@FindBy(id = "departure")
	private WebElement departure;

	public FlightSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
