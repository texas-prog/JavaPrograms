package anything;
import java.util.Scanner;

public class FibonacciPractice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numeber n: ");
		int num = sc.nextInt();
		int first = 0, second = 1;
		
		if(num <= 0) {
			System.out.println("Please enter a number bigger than 0 ");
		}else {
			System.out.println("Fibonacci Series: ");
		}
		
		for(int i = 1; i <= num; i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
		sc.close();
	}
}
