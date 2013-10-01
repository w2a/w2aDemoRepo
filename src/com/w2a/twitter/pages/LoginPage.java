package com.w2a.twitter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w2a.twitter.core.Page;

public class LoginPage extends Page {
	
	
	@FindBy(xpath="//*[@id='front-container']/div[3]/div[2]/form/div[1]/label")
	public WebElement username;
	@FindBy(xpath="//*[@id='front-container']/div[3]/div[2]/form/table/tbody/tr/td[1]/div/label")
	public WebElement pass;
	@FindBy(xpath="//*[@id='front-container']/div[3]/div[2]/form/table/tbody/tr/td[2]/button")
	public WebElement login;


	
	
	
	public LandingPage doLogin(String usernam, String password){
		
		username.sendKeys(usernam);
		pass.sendKeys(password);
		login.click();
		
		
		/*
		driver.findElement(By.xpath("")).sendKeys(username);
		driver.findElement(By.xpath("")).sendKeys(password);
		driver.findElement(By.xpath("")).click();
		*/
	
		
		return PageFactory.initElements(driver, LandingPage.class);
		
	}
	
	public void doSignup(String username, String Email, String password){
		
		
		
	}

}
