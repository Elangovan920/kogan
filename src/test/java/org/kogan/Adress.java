package org.kogan;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.testng.asserts.SoftAssert;

public class Adress extends Cart {
	@FindAll({@FindBy(name="address"),@FindBy(xpath="(//input[@type='text'])[3]")})
     private WebElement Street;
	@FindAll({@FindBy(name="address_postcode"),@FindBy(xpath="(//input[@type='text'])[4]")})
	private WebElement pcode;
	@FindAll({@FindBy(name="react-autowhatever-1--item-0"),@FindBy(xpath="(//li[@role='option'])[1]")})
	private WebElement select;
	@FindAll({@FindBy(id="business_address_checkbox"),@FindBy(xpath="(//input[@type='checkbox'])[2]")})
	private WebElement cbox;
	@FindAll({@FindBy(name="company_name"),@FindBy(xpath="(//input[@type='text'])[5]")})
	private WebElement bname;
	@FindAll({@FindBy(xpath="//span[text()='Continue']"),@FindBy(xpath="(//span[@class='buttonText'])")})
	private WebElement cntinue;
	public WebElement getStreet() {
		return Street;
	}
	public WebElement getPcode() {
		return pcode;
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getCbox() {
		return cbox;
	}
	public WebElement getBname() {
		return bname;
	}
	public WebElement getCntinue() {
		return cntinue;
	
	}
	
	
	public void address(String Street,String Bname) {
		SoftAssert a = new SoftAssert();
		sendKeys(getStreet(), Street);
		a.assertEquals(getStreet().getAttribute("value"), Street);
		sendKeys(getPcode(), "Me");
		click(getSelect());
		String ab = getStreet().getAttribute("value");
		a.assertTrue(ab.contains("3000"));
		click(getCbox());
		a.assertTrue(getCbox().isSelected());
		sendKeys(getBname(),Bname);
		a.assertEquals(getBname().getAttribute("value"), Bname);
		click(getCntinue());
		a.assertAll();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
