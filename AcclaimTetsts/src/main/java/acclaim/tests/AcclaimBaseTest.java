package acclaim.tests;

import org.junit.After;
import org.junit.Before;

import com.acclaim.framework.Driver;

public class AcclaimBaseTest {

	@Before
	public void setUp() {
		Driver.initialize();
	}
	
	@After
	public void tearDown() {
		Driver.close();
	}
}
