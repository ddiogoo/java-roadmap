public enum EnumSampleWithAbstract {
    MONDAY {
        @Override
        public void dummyMethod() {
            System.out.println("MONDAY");
        }
    },
    TUESDAY {
        @Override
        public void dummyMethod() {
            System.out.println("TUESDAY");
        }
    },
    WEDNESDAY {
        @Override
        public void dummyMethod() {
            System.out.println("WEDNESDAY");
        }
    },
    THURSDAY {
        @Override
        public void dummyMethod() {
            System.out.println("THURSDAY");
        }
    },
    FRIDAY {
        @Override
        public void dummyMethod() {
            System.out.println("FRIDAY");
        }
    },
    SATURDAY {
        @Override
        public void dummyMethod() {
            System.out.println("SATURDAY");
        }
    },
    SUNDAY {
        @Override
        public void dummyMethod() {
            System.out.println("SUNDAY");
        }
    };

    public abstract void dummyMethod();
}
