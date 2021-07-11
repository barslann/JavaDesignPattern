package creationalpatterns.abstractfactory.gui.approach1;

public class Test {
    public static void main(String[] args) {
        new Client(new ButtonFactory());
    }
}
