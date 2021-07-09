package solid.isp.solution;

/**
 * "complex" version interface.
 * Please note this interface extends the "simplest" one (textProcessor)
 *
 */
public interface MultiLanguage extends TextProcessor {
   boolean correct (Language language);
}
