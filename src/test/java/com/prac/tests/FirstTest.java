package com.prac.tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.prac.base.BaseTest;
import com.prac.pages.FirstPage;

import io.appium.java_client.android.AndroidDriver;

public class FirstTest extends BaseTest {
	AndroidDriver driver;
	FirstPage first;

	@BeforeMethod
	public void before() throws MalformedURLException {
		driver = launchMobileApp();
		first = new FirstPage(driver);
	}

	@Test
	public void test1() {
		first.accessbility();
	}
}
