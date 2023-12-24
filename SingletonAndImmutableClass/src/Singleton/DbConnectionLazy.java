package Singleton;

/**
 * Lazy Initialization
 */
public class DbConnectionLazy {
    private static DbConnectionLazy connObject;

    private DbConnectionLazy() {
    }

    public static DbConnectionLazy getInstance() {
        if (connObject == null) {
            connObject = new DbConnectionLazy();
        }
        return connObject;
    }
}
