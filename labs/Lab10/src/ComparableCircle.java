
public class ComparableCircle extends Circle2 implements Comparable {
	public ComparableCircle(double rad){
		super(rad);
	}
	public int compareTo (Object o) {
		if(getArea() < ((ComparableCircle)o).getArea())
			return 1;
		else if(getArea() < ((ComparableCircle)o).getArea())
			return -1;
		else
			return 0;
	}
}


