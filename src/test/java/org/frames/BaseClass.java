package org.frames;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;

public class BaseClass {

	public static WebDriver driver ;
	
	public static void browserLaunch(String e ) {
	   if(e.equalsIgnoreCase("chrome")) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\CucumberBDD\\src\\test\\resources\\chromedriver.exe");
			 driver = new ChromeDriver();
	   }
	   else if(e.equalsIgnoreCase("firefox")) {
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\MavenSample\\Driver\\geckodriver.exe");
		 driver = new FirefoxDriver();
	   }
	   else if(e.equalsIgnoreCase("edge")) {
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\MavenSample\\Driver\\msedgedriver.exe");
		  driver = new EdgeDriver();
	   }
	
	}
	public static  void implicityWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS );
		}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static  void urlLaunch(String url) {
		driver.get(url);

	}
	public static void click(WebElement wb ) {
		wb.click();
		}
	public static  void  sendKeys(WebElement a ,String d) {
		a.sendKeys(d);
		}
	public static File elementScreenshot(WebElement a,String r) throws IOException {
		File src = a.getScreenshotAs(OutputType.FILE);
		 File des = new File (r);
		FileUtils.copyFile(src, des);
		return des;
		 
      }
      public static File screenShot(String a) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		 File des = new File (a);
		 FileUtils.copyFile(src, des);
		return des;
	}
     public static void staticWait(int sec) throws InterruptedException {
		Thread.sleep(sec);

	}
     public static void keyBoard(String event ) throws AWTException {
    	 if(event.equalsIgnoreCase("enter")) {
    		 Robot r = new Robot();
    		 r.keyPress(KeyEvent.VK_ENTER);
    		 r.keyRelease(KeyEvent.VK_ENTER);
    	 }
    	 else if (event.equalsIgnoreCase("copy")) {
    		 Robot r = new Robot();
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_C);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_C);
    	 }
    	 else if(event.equalsIgnoreCase("paste")) {
    		 Robot r = new Robot();
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_V);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_V);
    	 }
    	 else if(event.equalsIgnoreCase("select")) {
    		 Robot r = new Robot();
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_A);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_A);
    	 }
    	 else if(event.equalsIgnoreCase("clear")) {
    		 Robot r = new Robot();
    		 r.keyPress(KeyEvent.VK_BACKSPACE);
    		 r.keyRelease(KeyEvent.VK_BACKSPACE);
    		 
    	 }
    	 }
     public static void selectby(WebElement a,int b) {
    	 
	 Select s = new Select(a);
	 s.selectByIndex(b);
     }
    	 public static  void selectbyValue(WebElement a,String d) {
    		 Select s = new Select(a);
    		 s.selectByValue(d);
		}
    	
    		public static String getText(WebElement a) {
				return a.getAttribute("value");
			}
    	 
          public static String currentUrl() {
        	  return driver.getCurrentUrl();
          }
    	 
    	 
	}

