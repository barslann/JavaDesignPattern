package creationalpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton s = Singleton.getInstance();
            s.printName();
        }

        Singleton s1 = Singleton.getInstance();
        System.out.println("\nHashCode: " + s1.hashCode());

        Singleton s2 = Singleton.getInstance();
        System.out.println("\nHashCode: " + s2.hashCode());

        if (s1 == s2) System.out.println("\nThe same object!");
        else System.out.println("\nDifferent objects");
    }
}
