class Overloading {
    void display(int num) {
        System.out.println("Integer: " + num);
    }

    void display(String str) {
        System.out.println("String: " + str);
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.display(10);
        obj.display("Hello");
    }
}
