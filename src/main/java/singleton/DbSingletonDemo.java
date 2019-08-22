package singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingletonLazyLoadedThreadSafe instance = DbSingletonLazyLoadedThreadSafe.getInstance();
        System.out.println(instance);

        DbSingletonLazyLoadedThreadSafe anotherInstance = DbSingletonLazyLoadedThreadSafe.getInstance();
        System.out.println(anotherInstance);
    }
}
