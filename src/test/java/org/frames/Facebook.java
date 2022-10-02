package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Facebook extends BaseClass{
	@Test
	private void m1() {
		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/");
		WebElement e1 = driver.findElement(By.id("email"));
		e1.sendKeys("elango");
		driver.findElement(By.id("pass")).sendKeys("123456");;
		driver.findElement(By.name("login")).click();
	}

}
