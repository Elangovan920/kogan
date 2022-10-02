package org.pfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class Page4 extends Page3 {
         public Page4() {
	      PageFactory.initElements(driver, this);
      }
     @FindBys({@FindBy(id="first_name"),@FindBy(xpath="(//input[@type='text'])[11]")})
     private WebElement fname ;
     @FindBy(xpath="(//input[@type='text'])[12]")   
     private WebElement lname ;    
     @FindAll({@FindBy(id="address"),@FindBy(xpath="(//input[@type='text'])[11]")})
     private WebElement address;
     @FindBy(id="cc_num")    
      private WebElement cardno ;
     @FindBy(id="cc_type")     
     private WebElement cardtype ;
     @FindBy(id="cc_exp_year")    
     private WebElement cardeyear ;
     @FindBy(id="cc_exp_month")    
     private WebElement cardemonth ;
     @FindBy(id="cc_cvv")    
     private WebElement cardcvv ;
     @FindBy(id="book_now")    
     private WebElement search ;
     @FindBy(id="order_no")
     private WebElement ono ;
	public WebElement getOno() {
		return ono;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCardeyear() {
		return cardeyear;
	}
	public WebElement getCardemonth() {
		return cardemonth;
	}
	public WebElement getCardcvv() {
		return cardcvv;
	}
	public WebElement getSearch() {
		return search;
	}
	public void page4(String fname,String lname ,String addr,String cno,int ctype ,int cyear,int cmonth,String cvv) {
	sendKeys(getFname(), fname);
	sendKeys(getLname(), lname);
	sendKeys(getAddress(), addr);
	sendKeys(getCardno(), cno);
	click(getCardtype());
	selectby(getCardtype(), ctype);
	selectby(getCardeyear(), cyear);
	selectby(getCardemonth(), cmonth);
	sendKeys(getCardcvv(), cvv);
	click(getSearch());
	}
         
         
         
}
