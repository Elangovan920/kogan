package org.kogan;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.testng.asserts.SoftAssert;

public class ProductPage extends SearchBox{
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//b[text()='Sony'])[1]")
	private WebElement prdt;
	@FindBy(xpath="(//div[starts-with(@class,'reac')])[3]")
	private WebElement clrbl;
	@FindBy(xpath="(//button[@type='button'])[5]")
	private WebElement side;
	@FindAll({@FindBy(xpath="//*[starts-with(@class,'buttonText')]"),@FindBy(xpath="//span[text()='Add to Cart']")})
	private WebElement check;
	@FindBy(xpath="(//span[contains(text(),'View cart & checkout')])[2]")
	private WebElement confirm;
	
	public WebElement getPrdt() {
		return prdt;
	}
	public WebElement getClrbl() {
		return clrbl;		
	}
	public WebElement getSide() {
		return side;
	}
	public WebElement getCheck() {	
		return check;
	}
	public WebElement getConfirm() {
		return confirm;
	}
	public void ProductPge() throws AWTException, InterruptedException {
		SoftAssert a = new SoftAssert();
		click(getPrdt());
		a.assertTrue(driver.getCurrentUrl().contains("noise-canceling-wireless"));
		click(getClrbl());
		keyboard("enter");
		a.assertTrue(driver.getCurrentUrl().contains("ear-headphones-black"));
		click(getClrbl());
        keyboard("down");
        keyboard("enter");
        Thread.sleep(1000);
        a.assertTrue(driver.getCurrentUrl().contains("ear-headphones-silver"));
        click(getClrbl());
        keyboard("down");
        keyboard("enter");
        a.assertTrue(driver.getCurrentUrl().contains("ear-headphones-black"));
        for(int i=0;i<8;i++) {
        	javaScript("click", getSide());
        }
        click(getCheck());
        a.assertTrue(driver.getCurrentUrl().contains("au/buy/sony-wh-1000xm5-noise"));
        javaScript("click", getConfirm());
      
        a.assertAll();
//      e5.click();
//       Actions ac = new Actions(driver);
//       ac.click(e5).perform();
//       ac.doubleClick().perform();;
//       ac.doubleClick().perform();;
//       WebElement e6 = driver.findElement(By.xpath("//i[@role='button']"));
//       e6.click();
//       String url4 = driver.getCurrentUrl();
//		boolean f1 = url4.contains("ear-headphones-black");
//		a.assertTrue(f1, "black");
	}
}
