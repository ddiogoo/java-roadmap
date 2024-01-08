public class Eagle3 implements Bird, Bird.NonFlyingBord {

    @Override
    public void canRun() {
        throw new UnsupportedOperationException("Unimplemented method 'canRun'");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
}
