package com.santander.automation.mobile.pages.android;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import com.santander.automation.appium.DriverSingleton;

import io.appium.java_client.MobileElement;

public class ServiceOptionalPage {
	
	private DriverSingleton driverSingleton;
	
	public ServiceOptionalPage() {
		
		driverSingleton = DriverSingleton.getInstance();
	}
	
	public void ownHandService() {
		
		driverSingleton.driver.findElement(By.id("checkMP")).click();
	}
	
	public void receiveNotificationService() {
		
		driverSingleton.driver.findElement(By.id("checkAR"));
	}
	
	public void valueStatementService() {
		
		driverSingleton.driver.findElement(By.id("checkDeclValor")).click();
		MobileElement value_statement = driverSingleton.driver.findElement(By.id("txt_valor"));
		assertTrue(value_statement.isDisplayed());
		
	}
}


