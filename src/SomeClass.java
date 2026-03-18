public class SomeClass {
    private String name;
    private String secondName;

    static {
        System.out.println("Static block");
    }

    static {
        System.out.println("Static block #2");
        class  SomeClass1 {

        }
    }

    public SomeClass(String name, String secondName) {
        System.out.println("Constructor");
        this.name = name;
        this.secondName = secondName;
        class ConstructorNewClass {
            String name;
            Integer cpu;
            Integer memory;
        }

    }

    public void someMethod(String param) {

        class LocalClass {
            private String name;
            private String secondName;

            void someMethod2(String param) {
                System.out.println(param);
            }
        }
        LocalClass localClass = new LocalClass();

    }


    class InnerClass {
        private final String name;
        public InnerClass(String name) {
            this.name = name;
            secondName = "";
        }
    }

    static class InnerClass2 {
        private final String name;
        public InnerClass2(String name) {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "name='" + name + '\'' +
                "secondName='" + secondName + '\'' +
                '}';
    }
}
