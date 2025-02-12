class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    Student(Student other) {
        this.name = other.name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student(s1);
        s2.display();
    }
}
