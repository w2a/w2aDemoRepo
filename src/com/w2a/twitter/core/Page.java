package com.w2a.twitter.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {
	
	
	public static WebDriver driver = null;
	
	public Page(){
		
		if(driver==null){
			
			this.driver = new FirefoxDriver();
			
		}
	}

}
