package TypesOfFunctionalInterface;

/**
 * Represent function, that accept one argument and return the boolean
 * 
 * Present in package: java.util.function
 */
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
