package creationalpatterns.abstractfactory.gui.approach1;

public class ListFactory implements GUIFactory{
    @Override
    public List create() {
        return new List();
    }
}
