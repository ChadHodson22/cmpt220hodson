
public abstract class GeometricObject implements Comparable {
	public int compareTo(Object obj) {
		if(getArea() > ((GeometricObject)obj).getArea()) {
			return 1;
		}
		else if(getArea() < ((GeometricObject)obj).getArea()) {
			return-1;
		}
		else
			return 0;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public static Comparable max(Comparable obj1, Comparable obj2) {
		if(obj1.compareTo(obj2) >= 0) {
			return obj1;
		}
		else {
			return obj2;
		}
	}
}

