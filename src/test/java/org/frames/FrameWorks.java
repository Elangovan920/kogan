package org.frames;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pfactory.Page2;
import org.pfactory.Page3;
import org.pfactory.Page4;
import org.pfactory.PomClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWorks extends Page4{
 
	@org.testng.annotations.BeforeClass
	public static void launch() {
		
		browserLaunch("chrome");
		urlLaunch("http://adactinhotelapp.com/");
		Assert.assertTrue(currentUrl().contains("adactin"), "url");
	}
	@BeforeMethod 
	public void waits() {
		implicityWait(10);
		
	}
	@org.testng.annotations.Test
	public void test1() {
		PomClass p = new PomClass();
		p.loginPage("elango123", "elango");
		String txt = getText(p.getUser());
		Assert.assertEquals("uname", "elango123",txt);
		String txt1 = getText(p.getPass());
		Assert.assertEquals("pass", "elango",txt1);
		click(p.getClick());
			}
	@org.testng.annotations.Test
	public void test2() throws AWTException {
		Page2 p = new Page2();
		p.page02(3, 3, 3, 3, "20/06/2022", "22/06/2022", 3, 3);
		String txt1 = getText(p.getLocation());
		Assert.assertEquals("Brisbane",txt1);
		String txt2 = getText(p.getHotel());
		Assert.assertEquals("hotel","Hotel Hervey",txt2);
		String txt3 = getText(p.getRoom());
		Assert.assertEquals("room type","Deluxe",txt3);
		String txt4 = getText(p.getNroom());
		Assert.assertEquals("no room","3",txt4);
		String txt5 = getText(p.getCheckin());
		Assert.assertEquals("check in","20/06/2022",txt5);
		String txt6 = getText(p.getCheckout());
		Assert.assertEquals("check out","22/06/2022",txt6);
		String txt7 = getText(p.getAdult());
		Assert.assertEquals("adult","3",txt7);
		String txt8 = getText(p.getChild());
		Assert.assertEquals("child","3",txt8);
		click(p.getSearch());
		
		
	}
	@org.testng.annotations.Test
	public void test3() {
		Page3 p = new Page3();
		click(p.getButton());
		boolean txt = p.getButton().isSelected();
		Assert.assertTrue(txt);
	   click(p.getSearch());

	}
	@org.testng.annotations.Test
	public void test4() throws InterruptedException {
		Page4 p = new Page4();
		p.page4("elango", "m", "udumalai", "1234567891234567", 3, 12, 10, "123");
		
		 String txt1 = getText( p.getFname());
		 Assert.assertEquals("f name", "elango",txt1);
		 String txt2 = getText( p.getLname());
		 Assert.assertEquals("l name", "m",txt2);
		 String txt3 = getText( p.getAddress());
		 Assert.assertEquals("address", "udumalai",txt3);
		 String txt4 = getText( p.getCardno());
		 Assert.assertEquals("card no", "1234567891234567",txt4);
		 String txt6 = getText( p.getCardemonth());
		 Assert.assertEquals("expiry month", "10",txt6);
		 String txt7 = getText( p.getCardeyear());
		 Assert.assertEquals("expiry year", "2022",txt7);
		 String txt8 = getText( p.getCardcvv());
		 Assert.assertEquals("cvv", "123",txt8);
		 click(p.getSearch());
		 staticWait(3000);
        String txt = getText(p.getOno());
        System.out.println(txt);
	}
	
}
