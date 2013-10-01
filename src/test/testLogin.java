package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.w2a.twitter.core.Page;
import com.w2a.twitter.pages.LandingPage;
import com.w2a.twitter.pages.LoginPage;

public class testLogin extends Page {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.get("http://twitter.com");
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		LandingPage lp = login.doLogin("ac@gmail.com", "45345");
		lp.gotoProfile();
		
		//	LandingPage lp = login.doLogin("", "");
		//lp.gotoProfile();

	}

}
