package creationalpatterns.singleton;

public class ThreadedLazySingletonDemo extends Thread {
    public static void main(String[] args) {
        for(int i = 0; i < 1000; i++){
            new ThreadedLazySingletonDemo().start();
        }
    }

    public void run(){
        ThreadedLazySingleton ls = ThreadedLazySingleton.getInstance();
        ls.printName();
    }
}
