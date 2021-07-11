package creationalpatterns.abstractfactory.gui.approach1;

public class TableFactory implements GUIFactory{
    @Override
    public Table create() {
        return new Table();
    }
}
