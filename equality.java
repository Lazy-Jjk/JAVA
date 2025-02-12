class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    boolean equals(Person other) {
        return this.name.equals(other.name);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Alice");
        System.out.println(p1.equals(p2));
    }
}
