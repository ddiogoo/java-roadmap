package TypesOfFunctionalInterface;

/**
 * Represent the supplier of the result.
 * 
 * Accepts no Input parameter but produce a result.
 * 
 * Present in package: java.util.function
 */
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
