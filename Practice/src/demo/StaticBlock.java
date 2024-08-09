package demo;

public class StaticBlock {
    static double pi;

    static {
        pi = 3.14159;
        System.out.println("Static block initialized pi to: " + pi);
    }

    public static double getCircleArea(double radius) {
        return pi * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double area = StaticBlock.getCircleArea(radius);
        System.out.println("Area of circle with radius " + radius + ": " + area);
    }
}
