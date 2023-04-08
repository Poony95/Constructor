package box;
class Box{
	private double width;
	private double length;
	private double height;
	
	public double calcVolume() {
		return width * length * height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
public class Boxtest {
	public static void main(String[] args) {
		Box b = new Box();
		b.setWidth(10);
		b.setLength(10);
		b.setHeight(10);
		System.out.println("박스의 가로:" + b.getWidth());
		System.out.println("박스의 세로:" + b.getLength());
		System.out.println("박스의 높이:" + b.getHeight());
		System.out.println("박스의 부피:" + b.calcVolume());
	}
}
