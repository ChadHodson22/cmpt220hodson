
public class Circle2 extends GeometricObject3{
	public double radius;
	public Circle2(double radius) {
		this.radius = radius;
	}
	public double getPerimeter() {
		return Math.PI * radius * radius;
	}
	public double getArea() {
		return 2 * Math.PI * radius;
	}
	public boolean equals(Object obj) {
		if (this.radius == ((Circle2)obj).radius)
			return true;
		return false;
	}
}

