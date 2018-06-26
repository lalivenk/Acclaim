package com.acclaim.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * This framework class (along with other classes that would be added as functionality grows)
 * helps the tests avoid the knowledge of the internal implementations
 * of the automation tool for several reasons, such as
 * 1) To make it easier to switch the tools (if needed in future for any reason)
 * 2) If needed to integrate different types of apps (for instance, a mobile app and web app, 
 * 		which have a lot of common features all while keeping the tests from 
 * 		having to know all these internal details
 * 3) If some third party tools/libraries need to be added, the tests don't need
 * 		to be aware of that (so do not need to add all those dependencies to the test projects)
 * 
 *   All the above apply to all the framework classes in this project, not just this class
 *   
 *   The basic reason for creating a separate project for framework (totally different from the test project)
 *   is to get the many benefits some of which are listed above 
 * */
public class Driver {

	public static WebDriver Instance;
	public static WebDriverWait wait;

	public WebDriver Instance() {
		return Instance;
	}

	/*
	 * Initializes the driver. This should be called before any test can run. Sets
	 * implicit wait time
	 */
	public static void initialize() {

		Instance = new ChromeDriver();
		Instance.manage().window().maximize();
		wait = new WebDriverWait(Instance, 6);
		// Set implicit wait to ensure that when an element is asked for, web driver
		// waits for this amount of time before saying it could not find that element
		// This doesn't seem to be working in some browsers, so commented it out
		// Instance.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
	}

	/* Closes the browser */
	public static void close() {
		Instance.close();
	}
}
