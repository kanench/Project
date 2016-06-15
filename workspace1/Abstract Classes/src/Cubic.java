
public class Cubic extends Rectangle {

	public double deepness;

	public Cubic(double width, double height, double deepness) {
		super(width, height);
		this.deepness = deepness;
	}
	
	public double volume(){
		return width*height*deepness;
		
	}
}
