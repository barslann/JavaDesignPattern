package solid.ocp.exercise;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

	
	public List<Integer> primes (int limit) {
		
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;

	}
	
	private boolean isPrime (int candidate) {
		for (int i = 2; i < candidate; i++) {
			if (candidate % i == 0) {
				return false;
			}
		}
		return true;
	}
}
