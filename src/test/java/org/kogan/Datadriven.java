package org.kogan;

import org.testng.annotations.DataProvider;

public class Datadriven {
	
	@DataProvider(name="product")
	public Object[][] product() {
		Object[][] obj = {{"","/shop/?q="},{"@@@@@","40%40%40"},{"Sony WH-1000XM5 Wireless Noise Cancelling Headphones (Black)","sony+headphone"}};
		return obj;

	}
    @DataProvider(name="checkout")
    public Object[][] checkout() {
    	Object[][] obj = {{"elango","elango murugesh","123456789123"},{"","",""},{"elango@gmail.com","elango murugesh","987654321"},{"elango@gmail.com","elango murugesh","8778056948"}};
		return obj;
	}
}
