package solid.ocp.solution;

import java.util.Comparator;

public class PrimeNumberGeneratorReversed extends PrimeNumberGenerator {

	public PrimeNumberGeneratorReversed() {
		this.comparator = Comparator.<Integer>naturalOrder().reversed();
	}
}
