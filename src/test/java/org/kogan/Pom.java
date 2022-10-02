package org.kogan;

import java.awt.AWTException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Pom extends Cart {
	@BeforeClass
	private void m2() throws InterruptedException {
		browserLaunch("edge");
		urlLaunch("https://www.kogan.com");
		Thread.sleep(25000);

	}
  @BeforeMethod
  private void waits() {
	implicityWait(10);
}
//================= validate search text box=======================================	
  
	@Test(dataProvider="product",dataProviderClass=Datadriven.class,priority=0)
  private void m1(String name,String url) throws AWTException {		
		SearchBox s = new SearchBox();
		s.page1(name, url);	
		
       }
// ==============================validate the selected product============================
	@Parameters("uname")
    @Test(priority=1)
    
    private void m3(String uname) throws AWTException, InterruptedException {
		System.out.println(uname);
    	ProductPage p= new ProductPage();
    	p.ProductPge(); 
    	
    }
    @Test(priority=2)
    private void m4() throws AWTException, InterruptedException {
    	Cart c= new Cart();
    	c.p1();
    }
//================================validate cart page=============================================        
    @Test(dataProvider="checkout",dataProviderClass=Datadriven.class,priority=3)
    private void m5(String email,String name,String phno) throws InterruptedException {
    	Cart c= new Cart();
    	c.cartPage(email, name, phno);
    }

//===============================ADDRESS PAGE========================================
@Test(priority=4)
private void m6() {
	Adress a = new Adress();
	a.address("melbourne", "garments");

}









}
