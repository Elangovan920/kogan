package org.kogan;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Cart extends SearchBox{
	public Cart() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath="(//i[starts-with(@class,'icon')])[1]"),@FindBy(xpath="(//button[@type='button'])[2]"),@FindBy(className="JUyOG")})
	private WebElement remove;
	@FindAll({@FindBy(xpath="(//i[starts-with(@class,'icon')])[2]"),@FindBy(xpath="(//button[@type='button'])[3]"),@FindBy(className="JUyOG")})
	private WebElement add;
	@FindBy(xpath="(//span[text()='998'])[1]")
	private WebElement price1;
	@FindBy(xpath="(//span[text()='499'])[1]")
	private WebElement price2;
	@FindAll({@FindBy(xpath="(//span[text()='Checkout'])[1]"),@FindBy(xpath="(//button[@type='button'])[3]")})
	private WebElement check;
	@FindBy(xpath="//span[text()='Checkout with free trial'] ")
	private WebElement checkfree;
	
	@FindAll({@FindBy(name="email"),@FindBy(xpath="(//input[@type='email'])[3]")})
	private WebElement email;
	@FindAll({@FindBy(name="full_name"),@FindBy(xpath="(//input[@type='text'])[2]")})
	private WebElement name;
	@FindAll({@FindBy(name="phone"),@FindBy(xpath="(//input[@type='tel'])")})
	private WebElement phno;
	@FindAll({@FindBy(xpath="//span[text()='Continue'] "),@FindBy(xpath="(//span[@class='buttonText'])[3]")})
	private WebElement btnclk;
		public WebElement getEmail() {
		return email;
		
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getBtnclk() {
		return btnclk;
	}
	
	public WebElement getRemove() {
		return remove;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getPrice1() {
		return price1;
	}
	public WebElement getPrice2() {
		return price2;
	}
	public WebElement getCheck() {
		return check;
	}
	public WebElement getCheckfree() {
		return checkfree;
	}
	public void p1() throws InterruptedException {
		SoftAssert a = new SoftAssert();	     
	    
	    
	 //   javaScript("click", getRemove());	     
	    javaScript("click", getAdd());	     		
		a.assertEquals(getPrice1().getText(), "$998");
		 javaScript("click", getRemove());
		a.assertEquals(getPrice2().getText(), "$499");
		 javaScript("click", getCheck());
		javaScript("click", getCheckfree());
		a.assertAll();
			
	
		

	}
	
public  void cartPage(String email , String name,String phno) throws InterruptedException {
	  WebDriverWait w = new  WebDriverWait(driver, 10);
	 
	    getEmail().clear();
	
	javaScriptsk(getEmail(), email);	
	String a1 = getEmail().getAttribute("value");
	System.out.println(a1);
	
	javaScriptsk(getName(), name);
	String b = getName().getAttribute("value");
	System.out.println(b);
	
	javaScriptsk(getPhno(), phno);
	Thread.sleep(1000);
	String c = getPhno().getAttribute("value");
	System.out.println(c);
	
	javaScript("click", getBtnclk());
//
}
	
}
