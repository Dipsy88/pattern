package singleton;

/**
 * Thread safe
 */

public class DbSingletonLazyLoadedThreadSafe {

    private static volatile DbSingletonLazyLoadedThreadSafe instance = null;

    private DbSingletonLazyLoadedThreadSafe() {
        if (instance!=null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingletonLazyLoadedThreadSafe getInstance() {
        if (instance == null) {
            synchronized (DbSingletonLazyLoadedThreadSafe.class){
                if (instance == null){
                    instance = new DbSingletonLazyLoadedThreadSafe();
                }
            }
        }
        return instance;
    }
}
