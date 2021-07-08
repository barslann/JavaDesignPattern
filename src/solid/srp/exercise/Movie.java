package solid.srp.exercise;

public class Movie {

	private final String title;
	private final String genre;
	private final String director;
	
	public Movie(String title, String genre, String director) {
		this.title = title;
		this.genre = genre;
		this.director = director;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", director=" + director + "]";
	}
	
	
}
