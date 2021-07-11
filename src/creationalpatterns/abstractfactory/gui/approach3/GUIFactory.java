package creationalpatterns.abstractfactory.gui.approach3;

interface GUIFactory {
	
    public Component createButton();
    
    public Component createList();
    
    public Component createTable();
}
