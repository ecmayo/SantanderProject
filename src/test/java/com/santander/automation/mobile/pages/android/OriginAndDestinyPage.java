package com.santander.automation.mobile.pages.android;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.santander.automation.appium.DriverSingleton;

import io.appium.java_client.MobileElement;

public class OriginAndDestinyPage {

	private DriverSingleton driverSingleton;

	public OriginAndDestinyPage() {
		driverSingleton = DriverSingleton.getInstance();
	}

	public void informOriginDestinZipCodes() {

		driverSingleton.waitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("navigation_drawer"))); 
		driverSingleton.driver.navigate().back();

		driverSingleton.driver.findElement(By.id("txt_data")).click();

		driverSingleton.driver.findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys("Jan"); 
		driverSingleton.driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys("24");
		driverSingleton.driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys("1987");

		driverSingleton.driver.findElement(By.id("button1")).click();
		driverSingleton.driver.findElement(By.id("txt_cep_ori")).sendKeys("69054238");
		driverSingleton.driver.findElement(By.id("txt_cep_dest")).sendKeys("04777001");
	}
	
	public void clickNextSteps() {
		driverSingleton.driver.findElement(By.id("button_prox")).click();
	}
}
