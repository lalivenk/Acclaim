package com.acclaim.framework.pages;

import org.openqa.selenium.By;

import com.acclaim.framework.Driver;

public class UserProfilePage extends BasePage{
	
	//The value for the 'baseURL' is supposed to be read from config and used here, but for the sake of simplicity, using the URL directly
	//String url = String.format("%s//%s", baseURL);
	
	static String userBaseURL = "https://www.youracclaim.com/user/";

	public static void goTo(String userName) {

		Driver.Instance.get(String.format("%s//%s", userBaseURL, userName));

		// TODO Assert the navigation to this page is successful (there are various
		// ways, ex: checking the title of the page, url)
		// Better yet, have a method that returns boolean that specifies if the
		// application is on this page
	}
	

	/* Returns the number of badges displayed */
	public static int getDisplayedBadgeCount() {

		// I usually write framework for element finders instead of repeating such
		// things as this CSS selectors here, but because this is just part of
		// the assignment, I included it here in this method itself
		return Driver.Instance.findElements(By.cssSelector("a[class='badge-card do-not-underline']")).size();
	}
	
}
