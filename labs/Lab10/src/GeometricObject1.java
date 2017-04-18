
public abstract class GeometricObject1 {
	private String color = "white";
	private boolean filled;
	
	protected GeometricObject1() {
	}
	
	protected GeometricObject1 (String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void ifFilled(boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();

}

