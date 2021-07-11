package creationalpatterns.abstractfactory.gui.approach2;

public class GUIFactoryImpl implements GUIFactory {
	@Override
    public Button createButton() {
        return new Button();
    }

	@Override
	public List createList() {
		return new List();
	}

	@Override
	public Table createTable() {
		return new Table();
	}
}
