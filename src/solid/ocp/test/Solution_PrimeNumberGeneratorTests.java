package solid.ocp.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


import org.junit.Assert;
import solid.ocp.solution.PrimeNumberGenerator;
import solid.ocp.solution.PrimeNumberGeneratorReversed;

import static org.hamcrest.CoreMatchers.*;

public class Solution_PrimeNumberGeneratorTests {
	
	@Test
	public void test_natural_order() {
		
		PrimeNumberGenerator generador = new PrimeNumberGenerator();
		List<Integer> expected = Arrays.asList(2,3,5,7,11,13);
		
		Assert.assertThat(generador.primes(15), is(expected));
	}	

	@Test
	public void test_reverse_order() {
		
		PrimeNumberGenerator generador = new PrimeNumberGeneratorReversed();
		List<Integer> expected = Arrays.asList(13,11,7,5,3,2);
		
		Assert.assertThat(generador.primes(15), is(expected));
	}	

}
