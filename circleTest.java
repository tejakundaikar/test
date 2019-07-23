package circle;

import junit.framework.TestCase;

public class circleTest extends TestCase {

	public void testGetRadius() {
		
		circle c=new circle();
		//''''
		float radius=5;   
		c.setRadius(radius);
		float g=5;
		assertEquals(g,c.getRadius());
	}

}
