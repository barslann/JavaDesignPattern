package solid.srp.solution;

import solid.srp.exercise.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class CSVExporter {
    public String export(List<Movie> recommendations){
        return recommendations.stream()
                .map(p -> (p.getTitle() + "," + p.getDirector()+ "," + p.getGenre() ))
                .collect(Collectors.joining("\n"));

    }
}
