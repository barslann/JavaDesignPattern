package solid.srp.test;

import java.util.List;

import org.junit.Test;
import org.junit.Assert;
import solid.srp.exercise.BBDD;
import solid.srp.exercise.Movie;
import solid.srp.solution.CSVExporter;
import solid.srp.solution.Recommender;

public class TestRecommender {

	@Test
	public void basic_test() {
		Recommender r = new Recommender();
		List<Movie> recommenations = r.recommendations(BBDD.JOHN);
		Assert.assertFalse(recommenations.contains(BBDD.ET));
	}
	
	@Test 
	public void test_format() {
		Recommender r = new Recommender();
		
		String csv = new CSVExporter().export(r.recommendations(BBDD.JOHN));
		
		String expected = "Saving Private Ryan,Spielberg,war";
		
		Assert.assertEquals(expected, csv);

	}

}
