package creationalpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            EagerSingleton s = EagerSingleton.getInstance();
            s.printName();
        }

        EagerSingleton s1 = EagerSingleton.getInstance();
        System.out.println("\nHashCode: " + s1.hashCode());

        EagerSingleton s2 = EagerSingleton.getInstance();
        System.out.println("\nHashCode: " + s2.hashCode());

        if (s1 == s2) System.out.println("\nThe same object!");
        else System.out.println("\nDifferent objects");
    }
}
