package rectangle;

class Rectangle{
	double width;
	double length;
	public double calcArea() {
		double area = width * length;
		return area;
		
	}
}
public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.width = 3.3;
		r.length = 5.2;
		System.out.println(r.calcArea());
		
	}	
}
