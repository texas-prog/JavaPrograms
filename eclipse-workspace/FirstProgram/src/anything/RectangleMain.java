package anything;
import java.util.Scanner;

public class RectangleMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the Rectangle: ");
		double length = sc.nextDouble();
		System.out.println("Enter width of the Rectangle: ");
		double width = sc.nextDouble();
		Rectangle rectangle = new Rectangle(length, width);
		System.out.println("Original Rectangle Area: " + rectangle.area());
		rectangle.doubleDimensions();
		System.out.println("Modified Rectangle Area: " + rectangle.area());
		sc.close();
	}
}
