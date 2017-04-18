
public class Octagon extends GeometricObject4 implements Colorable, Cloneable {
private double side;
	
	public Octagon () {	
	}
	public Octagon (double side) {
		this.side = side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public double getArea() {
		return (2+(4/Math.sqrt(2)))*side*side;
	}
	public double getPerimeter() {
		return 8*side;
	}
	public int compareTo(Object obj) {
		if(getArea() == ((Octagon)obj).getArea())
			return 0;
		else if (getArea() > ((Octagon)obj).getArea())
			return 1;
		else 
			return -1;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

