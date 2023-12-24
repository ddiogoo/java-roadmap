package Singleton;

/**
 * Syncronized Method
 */
public class DbConnectionWithSyncronizedMethod {
    private static DbConnectionWithSyncronizedMethod connObject;

    private DbConnectionWithSyncronizedMethod() {
    }

    /**
     * O uso de synchronized em um método garante que a execução deste método seja
     * realizada apenas por uma Thread por vez, utilizando um mecanismo de lock. A
     * Thread que começa a executar o método “pega” o lock, liberando-o ao término
     * da execução do método. Threads que não possuem o lock devem aguardar a
     * liberação para poder invocar o método.
     * 
     * @return Instância de DbConnectionWithSyncronizedMethod
     */
    synchronized public static DbConnectionWithSyncronizedMethod getInstance() {
        if (connObject == null) {
            connObject = new DbConnectionWithSyncronizedMethod();
        }
        return connObject;
    }
}
