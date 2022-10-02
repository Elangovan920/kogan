package org.pfactory;

import java.awt.AWTException;

import org.checkerframework.checker.units.qual.m2;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main extends Page4 {
	
	@BeforeClass
	private void m1() {
		browserLaunch("chrome");
		implicityWait(10);
		urlLaunch("https://adactinhotelapp.com/");
	}
	@Test
private void m2() throws AWTException {
		Page4 p= new Page4();
	p.loginPage("elango123", "elango");
	p.page02(2, 2, 2, 1, "13/09/2022", "16/09/2022", 2, 2);
   p. page3();
   p. page4("elango", "m", "udumalpet", "1234567891234567", 2, 10, 9, "123");
}
}
