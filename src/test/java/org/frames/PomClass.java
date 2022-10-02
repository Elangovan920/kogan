package org.frames;

import org.frames.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass extends BaseClass {

	public PomClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement user ;
	@FindBy(id="password")
	private WebElement pass ;
	@FindBy(id="login")
	private WebElement click ;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getClick() {
		return click;
	}
	
	public void loginPage(String a ,String b) {
		sendKeys(getUser(), a);
		sendKeys(getPass(), b);
		//click(getClick());
	}
	
	
	
	
}
