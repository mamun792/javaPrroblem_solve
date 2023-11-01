abstract class Problem16 {
      public abstract double getArea();
    public abstract double getPerimeter();
}

class Rectangle extends  Problem16{
    private  double with;
    private  double height;

    public  Rectangle(double with,double height){
        this.height=height;
        this.with=with;
    }

    public  double getArea(){
        return with*height;
    }
    public  double getPerimeter(){
        return 3*(with+height);
    }
}

class   Circle  extends  Problem16{
    private  double radius;

    public  Circle(double radius){
        this.radius=-radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return  Math.PI*radius*radius;
    }
}

class Triangle extends Problem16 {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

class  ShapeApp{
    public static void main(String[] args) {
        Problem16 problem16=new Circle(4.0);
        Problem16 ra=new Rectangle(5.0,6.0);
        Problem16 tr=new Triangle(3.0,4.0,5.0);

        System.out.println("Rectangle Area: " + ra.getArea());
        System.out.println("Rectangle Perimeter: " + ra.getPerimeter());

        System.out.println("Circle Area: " + problem16.getArea());
        System.out.println("Circle Perimeter: " + problem16.getPerimeter());
    }
}

