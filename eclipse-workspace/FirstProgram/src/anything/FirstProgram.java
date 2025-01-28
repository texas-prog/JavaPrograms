package anything;
import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		System.out.println("Enter the coefficients for a, b, and c where a is not 0 ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		if (a==0) {
			System.out.println("a cannot be zero/0 ");
		} else {
			double b = sc.nextInt();
			double c = sc.nextInt();
			double z = b*b-4*a*c;
			EquationCheck ob = new EquationCheck();
			if (z<0) {
				System.out.println("there are no real solutions ");
				ob.check(a,b,c);
				ob.display();
			} else if(z==0) {
				System.out.println("the solutions are real and equal ");
				ob.check(a, b, c);
				ob.display();
			}
			else {
				System.out.println("there are distinct real solutions ");
				ob.check(a,b,c);
				ob.display();
			}
		}
		sc.close();
	}

}

class EquationCheck {
	double a;
	double b;
	double c;
	double x1;
	double x2;
	public void check(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		double z = Math.pow(b*b-4*a*c, 0.5);
	x1 = (-b-z/2*a);
	x2 = (-b+z/2*a);
	}
	public void display() {
		System.out.println(x1);
		System.out.println(x2);
	}
}