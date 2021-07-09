package solid.isp.solution;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextProcessorTests {

	@Test
	public void simple_test() {
		
		/* No need to use the "complex" interface */
		TextProcessor procesador = new TextProcessorImpl();
		
		procesador.add("Spelynk");
		procesador.add("doesnt");
		procesador.add("matter");
		
		assertEquals("Spelynk doesnt matter", procesador.text());
	}
	
	@Test
	public void test_using_language() {
		
		MultiLanguage procesador = new TextProcessorImpl();
		
		procesador.add("I");
		procesador.add("am");
		procesador.add("hungry");
		
		assertEquals("I am ungry", procesador.text());
		
		assertTrue(procesador.correct(Language.EN));
	}
}
