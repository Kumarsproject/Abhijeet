package com.appl.testchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		//this will launch the googlechrome browser
		System.out.println("Chrome Drive is up");
		driver.get("https://www.google.com");
		//this will launch the perticular URL
		System.out.println("Application is up and ready to use");
		
				
				

	}

}
