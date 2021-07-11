package creationalpatterns.abstractfactory.gui.approach1;

public class Table implements Component{
    @Override
    public void paint() {
        System.out.println("painting table");
    }
}
