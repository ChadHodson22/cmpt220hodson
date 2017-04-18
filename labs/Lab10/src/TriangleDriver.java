
public class TriangleDriver {
	public static void main (String[] args) {
		Triangle triangle = new Triangle(1, 1.5, 1);
		triangle.setColor("Yellow");
		triangle.ifFilled(true);
		System.out.println(triangle);
		System.out.println("The area is "+ triangle.getArea());
		System.out.println("The perimeter is "+ triangle.getPerimeter());
		System.out.println(triangle);
	}

}

