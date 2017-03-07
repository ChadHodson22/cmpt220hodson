import java.text.DecimalFormat;
public class Problem91 {
	public static void main(String[] args) {

		class Rectangle {
			double width = 1.0;
			double height = 1.0;
			Rectangle() {
			}
			Rectangle(double newWidth, double newHeight) {
				width = newWidth;
				height = newHeight;
			}
			double getArea() {
				return width * height;
			}
			double getPerimeter() {
				return 2 * (width + height);
			}
		}

		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);

		DecimalFormat ab = new DecimalFormat("##.##");
		System.out.println("The Details of the first rectangle");
		System.out.println("The Width of Rectangle 1 is: " + rect1.width );
		System.out.println("The Height of Rectangle 1 is: " + rect1.height );
		System.out.println("The Area of Rectangle 1 is: " + ab.format(rect1.getArea()));
		System.out.println("The Perimeter of Rectangle 1 is: " + rect1.getPerimeter());
		
		System.out.println("The Details of the Second rectangle");
		System.out.println("The Width of Rectangle 2 is: " + rect2.width );
		System.out.println("The Height of Rectangle 2 is: " + rect2.height );
		System.out.println("The Area of Rectangle 2 is: " + ab.format(rect2.getArea()));
		System.out.println("The Perimeter of Rectangle 2 is: " + rect2.getPerimeter());
	}

}
