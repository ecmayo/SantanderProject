package com.santander.automation.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class DriverSingleton {
	
	private static DriverSingleton instance;
	public AppiumDriver<MobileElement> driver;
	public WebDriverWait waitVar; 
	
	private DriverSingleton() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		//ASUS
		cap.setCapability("deviceName","ASUS_X00ID");
		cap.setCapability("udid","H8AXB771E717FUP");
		cap.setCapability("platformName","Android"); 
		cap.setCapability("platformVersion","8.1.0");
		
		//SAMSUNG
//		cap.setCapability("deviceName","SM-J415G");
//		cap.setCapability("udid","c05f002b");
//		cap.setCapability("platformName","Android"); 
//		cap.setCapability("platformVersion","9");
		
		cap.setCapability("appPackage","br.com.correios.calculaprecoprazo");
		cap.setCapability("appActivity","br.com.correios.calculaprecoprazo.activity.SplashScreenActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		waitVar = new WebDriverWait(driver, 90);
		
	}
	
	public static DriverSingleton getInstance () {
		
		if(instance==null) {
			try {
				instance = new DriverSingleton();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
	
}
