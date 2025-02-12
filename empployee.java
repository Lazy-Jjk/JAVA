class Employee {
    String name, jobTitle;
    double salary;

    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Salary: " + salary);
    }

    void updateSalary(double newSalary) {
        salary = newSalary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Manager", 50000);
        emp.calculateSalary();
        emp.updateSalary(55000);
        emp.calculateSalary();
    }
}
