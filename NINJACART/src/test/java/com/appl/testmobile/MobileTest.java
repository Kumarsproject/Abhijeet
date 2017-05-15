package com.appl.testmobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest {

	public static void main(String[] args) throws MalformedURLException, Exception {
		
		DesiredCapabilities capability = new DesiredCapabilities();
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capability);
		//AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capability);
		
		System.out.println("Appium and Application launched");
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Username']")).sendKeys("sankalpa");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.EditText[@ resource-id ='com.nc.direct:id/etLoginPassword']")).sendKeys("Password");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.TextView[@ resource-id ='com.nc.direct:id/tvLoginValidation']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
