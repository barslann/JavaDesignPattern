package creationalpatterns.abstractfactory.gui.approach2;

interface GUIFactory {

	public Component createButton();

	public Component createList();

	public Component createTable();
}
