package com.prac.pages;

import org.openqa.selenium.WebElement;

import com.prac.base.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FirstPage extends BasePage {
	public FirstPage(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);

	}

	@AndroidFindBy(accessibility="Accessibility")
	WebElement Accessibility;
	@AndroidFindBy(accessibility="Animation")
	WebElement Animation;
	@AndroidFindBy(accessibility="App")
	WebElement App;
	@AndroidFindBy(accessibility="Content")
	WebElement Content;
	@AndroidFindBy(accessibility="Graphics")
	WebElement Graphics;
	@AndroidFindBy(accessibility="Media")
	WebElement Media;
	@AndroidFindBy(accessibility="NFC")
	WebElement NFC;
	@AndroidFindBy(accessibility="OS")
	WebElement OS;
	@AndroidFindBy(accessibility="Preference")
	WebElement Preference;
	@AndroidFindBy(accessibility="Text")
	WebElement Text;
	@AndroidFindBy(accessibility="Views")
	WebElement Views;
	
	public void accessbility() {
		Accessibility.click();
	}
	public void animation() {
		Animation.click();
	}
	public void app() {
		App.click();
	}
	public void content() {
		Content.click();
	}
	public void graphics() {
		Graphics.click();
	}
	public void media() {
		Media.click();
	}
	public void nfc() {
		NFC.click();
	}
	public void os() {
		OS.click();
	}
	public void preference() {
		Preference.click();
	}
	public void text() {
		Text.click();
	}
	public void views() {
		Views.click();
	}
}
