package solid.lsp.exercise;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PointsTests {

	private final Point2D reference = new Point2D(3,5);
	private final List<Point2D> test_points = Arrays.asList(
			                                         new Point2D(2,3), 
			                                         new Point2D(3,5), 
			                                         new Point2D(4,3)
			                                         );
	
	
	@Test
	public void test_equal_if_only_if_dinstance_0() {
		
		for (Point2D point: test_points) {
			Assert.assertEquals("test for " + reference + " and " + point,
					             reference.equals(point), 
					             reference.distance(point) == 0);
		}
	}

}
