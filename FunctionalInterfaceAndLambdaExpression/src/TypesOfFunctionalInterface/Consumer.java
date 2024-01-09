package TypesOfFunctionalInterface;

/**
 * Represent an operation, that accept a single input parameter and returns no
 * result.
 * 
 * Present in package: java.util.function
 */
@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);
}
