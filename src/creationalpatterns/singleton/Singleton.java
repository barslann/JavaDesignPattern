package creationalpatterns.singleton;

public class Singleton {
    private Singleton(){
        count++;
        name = "Singleton " + count;
    }

    private static final Singleton singleton = new Singleton();
    private static int count;
    private String name;

    public static Singleton getInstance(){
        return singleton;
    }

    public void printName(){
        System.out.println(name);
    }

}
