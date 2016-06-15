
public class Circle extends Shape {

	private double radius;
	public static final double pi = 3.14159265358979323846;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi * radius * radius;
	}

	@Override
	public double cirfcumference() {
		// TODO Auto-generated method stub
		return 2*pi*radius;
	}

}
