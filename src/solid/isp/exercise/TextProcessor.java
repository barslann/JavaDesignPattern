package solid.isp.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextProcessor {
	private List<String> text = new ArrayList<>();
	
	public void add(String word) {
		text.add(word);
	}
	
	public String text() {
		return text.stream().collect(Collectors.joining(" "));
	}
	
	public boolean correct(Language language) {
		for (String word: text) {
			if (! language.dictionary.contains(word.toLowerCase())) {
				return false;
			}
		}
		return true;
	}
}
