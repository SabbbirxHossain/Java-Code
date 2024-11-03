import java.util.Scanner;

class CircleArea {
	public double CalculateArea(double rad) {
		return 3.1416*(rad*rad);
	}
	
}
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter the radius of the circle: ");
		
		double radius = s.nextDouble();
		
		CircleArea circle = new CircleArea();
		double area = circle.CalculateArea(radius);
		
		System.out.println("The area of the circle is: " + area);
		
		
		

	}

}
