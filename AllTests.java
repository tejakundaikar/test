package circle;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
//hhh
	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(circleTest.class);
		suite.addTestSuite(testcircle.class);
		//$JUnit-END$
		return suite;
	}

}
