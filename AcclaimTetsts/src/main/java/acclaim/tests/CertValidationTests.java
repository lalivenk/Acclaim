package acclaim.tests;

import org.junit.Test;
import org.junit.Assert;

import com.acclaim.framework.pages.UserProfilePage;

public class CertValidationTests extends AcclaimBaseTest {

	/* The number of badges expected to be displayed */
	private final int EXPECTED_BADGE_COUNT = 5;

	/*
	 * This test verifies the number of badges displayed for the user
	 */
	@Test
	public void badgeCountMatches() {

		// This value should not be hard coded here and should come from the test bed
		UserProfilePage.goTo("lalita-gandrapu");
	
		Assert.assertEquals("number of certifications", EXPECTED_BADGE_COUNT, UserProfilePage.getDisplayedBadgeCount());		
	}
}
