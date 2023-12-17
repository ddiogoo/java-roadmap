package NestedClass;

public class OuterClass {
    private int instanceVariable = 10;
    private static int classVariable = 20;

    public static class NestedClass {
        public void print() {
            System.out.println(classVariable);
        }
    }

    public class InnerClass {
        public void print() {
            System.out.println(instanceVariable + classVariable);
        }
    }

    public void print() {
        System.out.println(instanceVariable);
    }

    public void display() {
        int methodLocalVariable = 3;

        class LocalInnerClass {
            int localInnerVariable = 4;

            public void print() {
                System.out.println(instanceVariable + classVariable + methodLocalVariable + localInnerVariable);
            }
        }

        LocalInnerClass localIneeClass = new LocalInnerClass();
        localIneeClass.print();
    }
}
