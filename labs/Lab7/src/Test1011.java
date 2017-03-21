
public class Test1011 {
	public class test6 {
		public void main(String[] args) {
			circle2d p1= new circle2d(2,2,5.5);
			System.out.println("Area of a circle: "
					+ p1.getArea());
			System.out.println("Perimeter of a circle: "
					+ p1.getPerimeter());
			System.out.println("The point (3,3) lies in p1: "
					+ p1.contains(3,3));
			
			circle2d p2 = new circle2d(4,5,10.5);
			System.out.println("circle, p1 Contains circle, p2: "
					+p1.contains(p2));
			circle2d p3 = new circle2d(3,5,3.5);
			System.out.println("circle, p3 overlaps with circle, p3: "
					+p1.contains(p3));

		}
	}

}
