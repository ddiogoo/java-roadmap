package AbstractClass;

public abstract class LuxuryCar extends Car {

    public LuxuryCar(int mileage) {
        super(mileage);
    }

    public abstract void pressDualBreakSystem();

    @Override
    public void pressBreak() {
        System.err.println("Luxury Car pressBreak method.");
    }
}
