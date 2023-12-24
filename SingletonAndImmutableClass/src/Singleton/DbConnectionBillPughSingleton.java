package Singleton;

public class DbConnectionBillPughSingleton {
    private DbConnectionBillPughSingleton() {
    }

    private static class DbConnectionHelper {
        private static final DbConnectionBillPughSingleton INSTANCE_OBJECT = new DbConnectionBillPughSingleton();
    }

    public static DbConnectionBillPughSingleton getInstance() {
        return DbConnectionHelper.INSTANCE_OBJECT;
    }
}
