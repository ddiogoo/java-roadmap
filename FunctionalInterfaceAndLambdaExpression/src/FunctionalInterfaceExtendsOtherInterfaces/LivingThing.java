package FunctionalInterfaceExtendsOtherInterfaces;

public interface LivingThing {
    default boolean canBreathe() {
        return true;
    }
}
