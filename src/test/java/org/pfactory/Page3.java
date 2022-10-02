package org.pfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 extends Page2 {
	public Page3() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement button ;
	@FindBy(id="continue")
	private WebElement search ;
	public WebElement getButton() {
		return button;
	}
	public WebElement getSearch() {
		return search;
	}
    
	
	public void page3() {
		click(getButton());
		click(getSearch());

	}
}
