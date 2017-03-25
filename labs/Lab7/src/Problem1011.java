// JA: Because the circle2D class is defined inside this class, it can not be called from the test file
public class Problem1011 {
	class circle2d {
		double x;
		double y;
		double radius;
		final double PI=3.14;
		
		public circle2d() {
			x=0;
			y=0;
			radius=1;
		}
		public circle2d(double x, double y, double r) {
			this.x=x;
			this.y=y;
			this.radius=r;
		}
		public double getRadius() {
			return radius;
		}
		public double getArea() {
			return PI*radius*radius;
		}
		public double getPerimeter() {
			return 2*PI*radius;
		}
		public double getDistance(double otherX, double otherY) {
			return Math.sqrt((otherX-x)*(otherX-x) +
					(otherY-y) * (otherY-y));
		}
		public boolean contains(double otherX, double otherY) {
			if (getDistance(otherX, otherY) < this.radius)
				return true;
			else
				return false;
		}
		public boolean contains(circle2d circle) {
			if(this.radius < getDistance(circle.x, circle.y)
					&& circle.radius > getDistance(circle.x, circle.y)) 
				return true;
			else
				return false;
		}
	}

}
