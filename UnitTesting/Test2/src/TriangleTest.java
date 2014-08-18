import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTest {
	
	Polygon p = new Triangle(5);
	
	@Test
	public void testGetPerimeter() {
		assertFalse(p.getPerimeter()<0);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetSumInteriorAngles() {
		assertEquals(p.getSumInteriorAngles(), 180.0, 0);
		//fail("Not yet implemented");
	}

}
