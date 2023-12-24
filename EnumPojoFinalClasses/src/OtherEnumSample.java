public enum OtherEnumSample {
    MONDAY {
        @Override
        public void dummyMethod() {
            System.out.println("monday dummy method");
        }
    },

    public void dummyMethod() {
        System.out.println("default dummy method");
    }
}