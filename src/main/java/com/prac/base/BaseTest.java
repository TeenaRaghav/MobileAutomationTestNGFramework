package com.prac.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	AndroidDriver driver;
	public AndroidDriver launchMobileApp() throws MalformedURLException {
		UiAutomator2Options option = new UiAutomator2Options();
		DesiredCapabilities caps = new DesiredCapabilities();

	caps.setCapability("deviceName", "emulator-5554");
//	caps.setCapability("appPackage", " com.android.calculator2");
//	caps.setCapability("appActivity", "com.android.calculator2.Calculator");
	caps.setCapability("platformVersion", "9");
	caps.setCapability("platformName", "Android");
	 caps.setCapability("automationName", "UiAutomator2");
	 File appDir=new File("C:\\Users\\teena\\eclipse-workspace\\MobileTestingPractisee\\Apps");
	File newApp = new File(appDir,"ApiDemos.apk");
	caps.setCapability("app",newApp.getAbsolutePath());
	driver = new AndroidDriver (new URL("http://127.0.0.1:4723"),caps);
	return driver;
}
}
