package org.kogan;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class SearchBox extends BaseClass{
     public SearchBox() {
		PageFactory.initElements(driver, this);
	}
     @FindBy(xpath="(//input[@type='text'])[1]")
 	private WebElement txtProduct;
     @FindBy(xpath="(//button[@type='button'])[1]")
     private WebElement cancelbtn;
     @FindBy(xpath="(//*[starts-with(@class,'search')])[9]")
     private WebElement searchbtn;
	public WebElement getTxtProduct() {
		return txtProduct;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public void page1(String product,String urls) {
		SoftAssert a = new SoftAssert();
		if(getCancelbtn().isEnabled()) {
			click(getCancelbtn());
		}
		sendKeys(getTxtProduct(), product);
		click(getSearchbtn());
		boolean bb = driver.getCurrentUrl().contains(urls);
		a.assertTrue(bb);
		a.assertAll();
		
	}
}
