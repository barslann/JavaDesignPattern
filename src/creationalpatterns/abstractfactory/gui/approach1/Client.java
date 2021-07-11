package creationalpatterns.abstractfactory.gui.approach1;
public class Client {
    public Client(GUIFactory factory){
        Component component = factory.create();
        component.paint();
    }
}