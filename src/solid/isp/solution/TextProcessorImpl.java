package solid.isp.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextProcessorImpl implements MultiLanguage, TextProcessor {

	private List<String> text = new ArrayList<>();
	
	@Override
	public void add (String word) {
		text.add(word);
	}
	
	@Override
	public String text () {
		return text.stream().collect(Collectors.joining(" "));
	}
	
	@Override
	public boolean correct (Language language) {
		for (String word: text) {
			if (! language.dictionary.contains(word.toLowerCase())) {
				return false;
			}
		}
		return true;
	}
}
