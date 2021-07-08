package solid.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class Client {
 
	private final String name;
	private final List<Movie> favorites;
	
	public Client (String name, Movie ... favorites) {
		this.name = name;
		this.favorites = Arrays.asList(favorites);
	}

	public String getName() {
		return name;
	}

	public List<Movie> getFavorites() {
		return favorites;
	}
	
	
}
