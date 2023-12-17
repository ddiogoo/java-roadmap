import AbstractClass.Audi;
import AbstractClass.LuxuryCar;
import ConcreteClass.Person;
import ConcreteClass.Rectangle;
import ConcreteClass.Shape;
import NestedClass.OuterClass;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("CONCRETE CLASS");
        concreteClasses();

        System.out.println("ABSTRACT CLASS");
        abstractClasses();

        System.out.println("NESTED CLASS");
        nestedClass();
    }

    private static void concreteClasses() {
        Person person = new Person(21);
        System.out.println(person.getEmpID());

        Shape rectangle = new Rectangle();
        rectangle.computeArea();
    }

    private static void abstractClasses() {
        LuxuryCar audi = new Audi(15);
        System.out.println(audi.getMileage());
        System.out.println(audi.getNumberOfWheels());
        audi.pressBreak();
        audi.pressClutch();
        audi.pressDualBreakSystem();
    }

    private static void nestedClass() {
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        nestedClass.print();

        OuterClass outerClass = new OuterClass();
        outerClass.print();
    }
}
