
public class GeometricObjectDemo {
public static void main(String[] args) {
		
		GeometricObject circle1 = new Circle(5);
		GeometricObject circle2 = new Circle(6);
		
		GeometricObject rectangle1 = new Rectangle(2, 8);
		GeometricObject rectangle2 = new Rectangle(3.5, 4);
		
		GeometricObject maxCircle = (GeometricObject)
		GeometricObject.max(circle1, circle2);
		
		GeometricObject maxRectangle = (GeometricObject)
		GeometricObject.max(rectangle1, rectangle2);
		
		System.out.println("Circle 1: ");
		printGeometricObject(circle1);
		
		System.out.println("Circle 2: ");
		printGeometricObject(circle2);
		
		System.out.println("Largest Circle:");
		printGeometricObject(maxCircle);
		
		System.out.println("Rectangle 1: ");
		printGeometricObject(rectangle1);
		
		System.out.println("Rectangle 2: ");
		printGeometricObject(rectangle2);
		
		System.out.println("Largest Rectangle: ");
		printGeometricObject(maxRectangle);
	}
	public static void printGeometricObject(GeometricObject obj) {
		System.out.println("Area: "+obj.getArea());
		System.out.println("Perimeter: "+obj.getPerimeter());
		System.out.println();
	}


}
