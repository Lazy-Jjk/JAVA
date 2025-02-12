import java.util.Scanner;

class Area {
    double length, breadth;

    void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area rect = new Area();
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        rect.setDim(l, b);
        System.out.println("Area of rectangle: " + rect.getArea());
    }
}
