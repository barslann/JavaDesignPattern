package creationalpatterns.singleton;

public class ThreadedLazySingleton {
    private static ThreadedLazySingleton singleton;

    private static int count;
    private String name;

    private ThreadedLazySingleton() {
        name = "ThreadedLazySingleton" + count;
        count++;
    }

    public static ThreadedLazySingleton getInstance() {
        synchronized (ThreadedLazySingleton.class) {
            if (singleton == null)
                singleton = new ThreadedLazySingleton();
        }

        return singleton;
    }

    public void printName() {
        System.out.println(name);
    }

}
