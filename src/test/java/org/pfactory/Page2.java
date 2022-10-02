package org.pfactory;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 extends PomClass {
	
	public Page2() {
		PageFactory.initElements(driver, this);
			}
	
	
    @FindBy(id="location")
	private WebElement location ;
    @FindBy(id="hotels")
    private WebElement hotel ;
    @FindBy(id="room_type")
    private WebElement room ;
    @FindBy(xpath="(//input[@type='text'])[2]")
    private WebElement checkin ;
    @FindBy(xpath="(//input[@type='text'])[3]")
    private WebElement checkout ;
    @FindBy(id="room_nos")
    private WebElement nroom ;
    @FindBy(name="adult_room")
    private WebElement adult ;
    @FindBy(id="child_room")
    private WebElement child ;
	@FindBy(id="Submit")
    private WebElement search ;
	
	
    public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getNroom() {
		return nroom;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearch() {
		return search;
	}

     public void page02(int location,int hotel,int roomtype,int nroom,String checkin,String checkout,int adult,int child) throws AWTException {
    	 click(getLocation());
    	 selectby(getLocation(), location);
    	 click(getHotel());
	     selectby(getHotel(), hotel);
	     click(getRoom());
	     selectby(getRoom(), roomtype);
	     click(getNroom());
	     selectby(getNroom(),nroom);
	     click(getCheckin());
	     keyBoard("select");
	     sendKeys(getCheckin(),checkin);
	     click(getCheckout());
	     keyBoard("select");
	     sendKeys(getCheckout(),checkout);
	     click(getAdult());
	     selectby(getAdult(), adult);
	     click(getChild());
	     selectby(getChild(), child);
	     click(getChild());
	     JavascriptExecutor js =  (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].click()", getSearch());
	     click(getSearch());
}
	
	 
	
	
	
	
	
	
	
	
	
	
}
