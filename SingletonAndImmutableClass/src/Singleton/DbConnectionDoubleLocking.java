package Singleton;

public class DbConnectionDoubleLocking {
    /**
     * O volatile é uma marcação que indica que o valor de uma variável será
     * modificado por diferentes threads. Declarar uma variável Java com volatile
     * significa que o valor dessa variável nunca será armazenado em cache
     * localmente, todas as leituras e gravações irão direto para a "main memory".
     * O acesso a uma variável volatile é mais lento que o normal O uso de
     * volatile é uma forma de sincronização em Java.
     */
    private static volatile DbConnectionDoubleLocking connObject;

    private DbConnectionDoubleLocking() {
    }

    public static DbConnectionDoubleLocking getInstance() {
        if (connObject == null) {
            synchronized (DbConnectionDoubleLocking.class) {
                if (connObject == null) {
                    connObject = new DbConnectionDoubleLocking();
                }
            }
        }
        return connObject;
    }
}
