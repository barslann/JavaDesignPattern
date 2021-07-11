package creationalpatterns.abstractfactory.gui.approach1;

public class ButtonFactory implements GUIFactory {
    public Button create() {
        return new Button();
    }
}

