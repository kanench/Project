
public class AppAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(3.0);
		System.out.println("The Area of Circle is : " + circle.area());
		System.out.println("The Circumference  of Circle is : " + circle.cirfcumference());
		Rectangle rec = new Rectangle(5.0,5.0);
		System.out.println("The Area of Rectangle is: " + rec.area());
		System.out.println("The Perimeter of Rectangle is: " + rec.cirfcumference());
		
		
		Cubic cube = new Cubic(3,4,5);
		
		System.out.println("Volume of cube is :" + cube.volume());
		
		Integer i = new Integer(42);
		Long l = new Long(42);
		Double d = new Double(42.0);
	
		System.out.println(i.equals(42));
		byte s1 = 100;
		byte s2 = 50;
		
		byte sum = (byte) (s1 + s2);
		System.out.println(sum);
		
		float a = 10 + 6;
	}
}
