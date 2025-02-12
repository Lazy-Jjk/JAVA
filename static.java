class StaticExample {
    static int staticVar = 10;

    static void staticMethod() {
        System.out.println("Static Method called");
    }

    static {
        System.out.println("Static Block executed");
    }

    static class StaticNested {
        void display() {
            System.out.println("Static Nested Class");
        }
    }

    public static void main(String[] args) {
        System.out.println("Static Variable: " + staticVar);
        staticMethod();
        StaticNested nested = new StaticNested();
        nested.display();
    }
}
