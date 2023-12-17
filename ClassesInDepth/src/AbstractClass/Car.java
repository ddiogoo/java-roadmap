package AbstractClass;

public abstract class Car {
    private int mileage;

    public Car(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return this.mileage;
    }

    public abstract void pressBreak();

    public abstract void pressClutch();

    public int getNumberOfWheels() {
        return 4;
    }
}
