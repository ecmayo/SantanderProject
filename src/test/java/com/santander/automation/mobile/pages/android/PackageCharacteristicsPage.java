package com.santander.automation.mobile.pages.android;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.DecimalFormat;
import java.time.Duration;

import org.openqa.selenium.By;

import com.santander.automation.appium.DriverSingleton;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class PackageCharacteristicsPage {

	private DriverSingleton driverSingleton;

	public PackageCharacteristicsPage() {
		driverSingleton = DriverSingleton.getInstance();
	}

	public void selectPackageAndBoxOpction() {

		driverSingleton.driver.findElement(By.id("imgCaixa")).click();

		MobileElement alturaElement = driverSingleton.driver.findElement(By.id("layout_altura"));
		MobileElement larguraElement = driverSingleton.driver.findElement(By.id("layout_largura"));
		MobileElement comprimentoElement = driverSingleton.driver.findElement(By.id("layout_comprimento"));

		assertTrue(alturaElement.isDisplayed());
		assertTrue(larguraElement.isDisplayed());
		assertTrue(comprimentoElement.isDisplayed());
	}

	public void selectEnvelopeOpction() {

		driverSingleton.driver.findElement(By.id("imgCarta")).click();

		MobileElement larguraElement = driverSingleton.driver.findElement(By.id("layout_largura"));
		MobileElement comprimentoElement = driverSingleton.driver.findElement(By.id("layout_comprimento"));

		assertTrue(larguraElement.isDisplayed());
		assertTrue(comprimentoElement.isDisplayed());
	}

	public void selectRollOpction() {

		driverSingleton.driver.findElement(By.id("imgCarta")).click();

		MobileElement comprimentoElement = driverSingleton.driver.findElement(By.id("layout_comprimento"));
		MobileElement diametroElement = driverSingleton.driver.findElement(By.id("layout_diametro"));

		assertTrue(comprimentoElement.isDisplayed());
		assertTrue(diametroElement.isDisplayed());
	}

	public void insertDimension() {

		driverSingleton.driver.findElement(By.id("layout_altura")).sendKeys("3");
		driverSingleton.driver.findElement(By.id("layout_largura")).sendKeys("11");
		driverSingleton.driver.findElement(By.id("layout_comprimento")).sendKeys("17");
	}

	public void swipeSeekBarWeight() {

		MobileElement seek_bar=driverSingleton.driver.findElement(By.id("seekBarPeso"));
		
		int start= seek_bar.getLocation().getX();
		int end = seek_bar.getSize().getWidth();
		int y = seek_bar.getLocation().getY();
		int height = seek_bar.getSize().getHeight();
		
		int moveTo=(int)(end*0.4);
		
		float valueEWSeekBar = (moveTo * 30)/end;
		
		System.out.println("value ------------------------ "+valueEWSeekBar);
		
		TouchAction action = new TouchAction(driverSingleton.driver);
		action.longPress(PointOption.point(start + 30, (y + height/2)))
									.moveTo(PointOption.point(moveTo, (y + height/2)))
									.release()
									.perform();
		
		MobileElement estimatedWeight = driverSingleton.driver.findElement(By.id("edDisplay"));
		String displayStr = estimatedWeight.getText();
		
		DecimalFormat df = new DecimalFormat("0.#");
		String seekBarValue = df.format(moveTo);
		
		assertEquals(seekBarValue, displayStr);
		System.out.println("displayStr ----------------> "+ displayStr);
	}
}
