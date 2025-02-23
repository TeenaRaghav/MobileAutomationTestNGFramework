package com.prac.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
 protected AndroidDriver driver;
 
 public BasePage(AndroidDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
 }
}

//AppiumFieldDecorator will actually create the mobile elements objects