abstract class Shape {
double dim1, dim2;

abstract double Area();

Shape(double x, double y) {
 dim1 = x;
 dim2 = y;
}

}

class Rectangle extends Shape {
Rectangle(double a, double b) {
super(a,b);
}

double Area() {
return dim1*dim2;
}
}

class Triangle extends Shape {
Triangle(double a, double b) {
super(a,b);
}

double Area() {
return (0.5)*dim1*dim2;
}
}

class Circle extends Shape {
Circle(double a) {
super(a, 0);
}

double Area() {
return (3.14)*dim1*dim1;
}
}

class area {
public static void main(String args[]) {
Shape ref;
double a1, a2, a3;
Rectangle r1 = new Rectangle(10.0,20.0);
Triangle r2 = new Triangle(10.0,20.0);
Circle r3 = new Circle(10.0);

ref = r1;
a1 = ref.Area();
System.out.println("Area of Rectangle: " + a1);

ref = r2;
a2 = ref.Area();
System.out.println("Area of Triangle: " + a2);

ref = r3;
a3 = ref.Area();
System.out.println("Area of Circle: " + a3);
}
}