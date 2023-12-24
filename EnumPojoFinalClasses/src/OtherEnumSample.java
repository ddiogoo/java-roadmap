public enum OtherEnumSample {
    MONDAY {
        @Override
        public void dummyMethod() {
            System.out.println("monday dummy method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public void dummyMethod() {
        System.out.println("default dummy method");
    }
}