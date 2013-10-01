package com.w2a.twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w2a.twitter.core.Page;

public class LandingPage extends Page {
	
	
	@FindBy(xpath="//*[@id='page-container']/div[1]/div[1]/div[1]/a/div/div/b")
	public WebElement profile;
	
	
	public void gotoProfile(){
		
		profile.click();
		
	}

}
