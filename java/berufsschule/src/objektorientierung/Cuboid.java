package objektorientierung;

public class Cuboid {
	private double length;
	private double width;
	private double height;
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}	
	public double getHeight() {
		return height;
	}
	
	public void setLength(double value) {
		length = value;
	}
	public void setWidth(double value) {
		width = value;
	}
	public void setHeight(double value) {
		height = value;
	}
	
	public void calcSurface() {
		System.out.println(2*(length*width)+2*(length*height)+2*(width*height));
	}
	public double calcEdgeLength() {
		return 4 * length + 4 * width + 4 * height;
	}
	public double calcVolume() {
		return length * width * height;
	}

}
