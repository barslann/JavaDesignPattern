package creationalpatterns.singleton;

public class EagerSingleton {
    private EagerSingleton(){
        count++;
        name = "EagerSingleton " + count;
    }

    private static final EagerSingleton singleton = new EagerSingleton();
    private static int count;
    private String name;

    public static EagerSingleton getInstance(){
        return singleton;
    }

    public void printName(){
        System.out.println(name);
    }
}
/*
*   object create etme - problemli
*
*  bi tane object olmasi
*
*   person person1 = new person();
*
*
*
* */