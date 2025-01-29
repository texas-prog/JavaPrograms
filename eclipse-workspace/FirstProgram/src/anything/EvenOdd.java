package anything;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("Why the fuck you enter 0");
		} else if(num % 2 == 0) {
			System.out.println("Even number Bitch");
		} else {
			System.out.println("Thas an Odd number");
		}
		sc.close();
	}
}
