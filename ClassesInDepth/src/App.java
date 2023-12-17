import ConcreteClass.Person;
import ConcreteClass.Rectangle;
import ConcreteClass.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("CONCRETE CLASS");
        concreteClasses();

        System.out.println("ABSTRACT CLASS");
        abstractClasses();
    }

    private static void concreteClasses() {
        Person person = new Person(21);
        System.out.println(person.getEmpID());

        Shape rectangle = new Rectangle();
        rectangle.computeArea();
    }

    private static void abstractClasses() {

    }
}
