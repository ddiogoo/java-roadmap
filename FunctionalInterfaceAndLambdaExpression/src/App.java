import FunctionalInterfaceExtendsOtherInterfaces.Bird2;
import Introduction.Bird;
import TypesOfFunctionalInterface.Consumer;
import TypesOfFunctionalInterface.Function;
import TypesOfFunctionalInterface.Predicate;
import TypesOfFunctionalInterface.Supplier;

public class App {
    public static void main(String[] args) throws Exception {
        execMethods();
        execTypeOfFunctionalInterface();
        execIntefaceExtendsOtherInterfaces();
    }

    private static void execIntefaceExtendsOtherInterfaces() {
        Bird2 eagle = () -> true;
        System.out.println(eagle.canBreathe());
    }

    private static void execTypeOfFunctionalInterface() {
        Consumer<Integer> logging = (Integer val) -> {
            if (val > 10) {
                System.out.println("Logging");
            }
        };
        logging.accept(11);

        Supplier<String> isEvenNumber = () -> "this is the data i am returning";
        System.out.println(isEvenNumber.get());

        Function<Integer, String> integerToString = (Integer num) -> {
            String output = num.toString();
            return output;
        };
        System.out.println(integerToString.apply(21));

        Predicate<Integer> isEven = (Integer val) -> {
            if (val % 2 == 0) {
                return true;
            }
            return false;
        };
        System.out.println(isEven.test(10));
    }

    private static void execMethods() {
        anonymousImplementation();
        usingLambdaExpression();
    }

    private static void anonymousImplementation() {
        // Anonymous
        Bird eagle = new Bird() {
            @Override
            public void canFly(String val) {
                System.out.println(val);
            }
        };
        eagle.canFly("hello");
    }

    private static void usingLambdaExpression() {
        Bird eagle = (String value) -> {
            System.out.println(value);
        };
        eagle.canFly("hello");
    }
}
