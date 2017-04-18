
public class OctagonTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Octagon test1 = new Octagon(5.0);
		Octagon test2 = (Octagon)test1.clone();
		
		System.out.println("The Area of first object="+test1.getArea());
		System.out.println("The Perimeter of first object="+test1.getPerimeter());
		System.out.println("The Area of the clone object="+test2.getArea());
		System.out.println("The Perimeter of the clone object="+test2.getPerimeter());
		System.out.println("\nCompare the two objects:");
		
		switch (test1.compareTo(test2)) {
		case 1:
			System.out.println("The first Object is larger than the clone object");
			break;
		case 0:
			System.out.println("Those objects are equal");
			break;
		case(-1):
			System.out.println("The first Object is Smaller than the clone Object");
		break;
		}

	}

}

