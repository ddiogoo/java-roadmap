package Introduction;

@FunctionalInterface
public interface OtherBird {
    void canFly(String val);

    default void getHeigth() {
        System.out.println("heigth");
    }

    static void canEat() {
        System.out.println("can eat");
    }

    String toString();
}
