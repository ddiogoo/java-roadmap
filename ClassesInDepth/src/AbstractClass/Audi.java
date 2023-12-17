package AbstractClass;

public class Audi extends LuxuryCar {

    public Audi(int mileage) {
        super(mileage);
    }

    @Override
    public void pressDualBreakSystem() {
        System.out.println("Audi pressDualBreakSystem method.");
    }

    @Override
    public void pressClutch() {
        System.out.println("Audi pressClutch method.");
    }
}
