class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Jane", 30);
        p1.printDetails();
        p2.printDetails();
    }
}
