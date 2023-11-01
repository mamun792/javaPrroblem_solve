//Implement an abstract class called "Shape" with abstract methods like "calculateArea" and "calculatePerimeter". Create concrete subclasses like "Rectangle", "Circle", and "Triangle" that extend the Shape class and provide their own implementations for these methods.



public abstract class Shape {
    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

class Rectangle1 extends Shape {
    private double length;
    private double width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;

    }

    public double calculateArea() {

        if (length > 0 && width > 0) {

            return length * width;
        } else {
            throw new IllegalArgumentException("Invalid length or width. Please provide positive values");
        }
    }

    public double calculatePerimeter() {

        if (length > 0 && width > 0) {

            return 2 * (length + width);
        } else {
            throw new IllegalArgumentException("Invalid length or width. Please provide positive values");
        }
    }
}

class Circle1 extends Shape {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;

    }

    public double calculateArea() {

        if (radius > 0) {
            return Math.PI * radius * radius;
        } else {

            throw new IllegalArgumentException("Invalid radius. Please provide positive values");
        }
    }

    public double calculatePerimeter() {

        if (radius > 0) {

            return 2 * Math.PI * radius;
        } else {

            throw new IllegalArgumentException("Invalid radius. Please provide positive values");
        }
    }
}

class Triangle1 extends Shape {
    private double base;
    private double height;

    private double a;
    private double b;

    private double c;

    public Triangle1(double base, double height, double a, double b, double c) {
        this.base = base;
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        if (base > 0 && height > 0) {

            return Math.PI * base * height;
        } else {

            throw new IllegalArgumentException("Invalid base or height. Please provide positive values");
        }
    }

    public double calculatePerimeter() {

        if (a > 0 && b > 0 && c > 0) {

            return a + b + c;
        } else {

            throw new IllegalArgumentException("Invalid A or B or C. Please provide positive values");
        }
    }
}

class Test4 {

    public static void main(String[] args) {

        Shape s1;
        try {
            s1 = new Rectangle1(5, 10);
            System.out.println("Area of Rectangle: " + s1.calculateArea());
            System.out.println("Perimeter of Rectangle: " + s1.calculatePerimeter());
            s1 = new Circle1(5);
            System.out.println("Area of Circle: " + s1.calculateArea());
            System.out.println("Perimeter of Circle: " + s1.calculatePerimeter());
            s1 = new Triangle1(5, 10, 6, 4, -20);
            System.out.println("Area of Triangle: " + s1.calculateArea());
            System.out.println("Perimeter of Triangle: " + s1.calculatePerimeter());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
