package assignment8Inheritance;

class Shape {
	public double area() {
		return 0;
	};
	public double perimeter() {
		return 0;
	};
}
class Square extends Shape{
	private double s;
	Square(double s){
		this.s = s;
	}
	public double area() {
		return s*s;
	}
	public double perimeter() {
		return 4*s;
	}
}
class Triangle extends Shape{
	private double a;
	private double b;
	private double c;
	private double base;
	private double height;
	
	
	Triangle(double a, double b, double c, double base, double height) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.base = base;
		this.height = height;
	}
	public double area() {
		return 0.5 * base * height;
	}
	public double perimeter() {
		return a+b+c;
	}
	
}
class Circle extends Shape{
	private double r;
	Circle(double r){
		this.r = r;
	}
	public double area() {
		return 3.14 * r * r;
	}
	public double perimeter() {
		return 3.14 * 2 * r;
	}
}
class Rectangle extends Shape{
	private double l, b;
	Rectangle(double l, double b){
		this.l = l;
		this.b = b;
	}
	public double area() {
		return l*b;
	}
	public double perimeter() {
		return 2 * (l + b);
	}
}

public class Geometric1 {

	public static void main(String[] args) {
		Shape square = new Square(5);
		System.out.println("Area Of Square "+square.area());
		System.out.println("Perimeter Of Square "+square.perimeter());
		System.out.println();
		Shape tirangle = new Triangle(1,2,3,5,8);
		System.out.println("Area Of Triangle "+tirangle.area());
		System.out.println("Perimeter Of Triangle "+tirangle.perimeter());
		System.out.println();
		Shape circle = new Circle(7);
		System.out.println("Area Of Circle "+circle.area());
		System.out.println("Perimeter Of Circle "+circle.perimeter());
		System.out.println();
		Shape rectangle = new Rectangle(8,5);
		System.out.println("Area Of Rectangle "+rectangle.area());
		System.out.println("Perimeter Of Rectangle "+rectangle.perimeter());
	}

}
