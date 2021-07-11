package creationalpatterns.abstractfactory.gui.approach2;

public class Test {
    public static void main(String[] args) {
        new Client(new GUIFactoryImpl());
    }
}

