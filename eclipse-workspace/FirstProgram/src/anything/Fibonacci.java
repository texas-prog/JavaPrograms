package anything;
import java.util.Scanner;

public class Fibonacci {
	public static int fibonacciRecursive(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}
	public static int fibonacciIterative(int n) {
		if (n <= 1) {
			return n;
		}
		int prev1 = 0;
		int prev2 = 1;
		int current = 0;
		for (int i = 2; i <= n; i++) {
			current = prev1 + prev2;
			prev1 = prev2;
			prev2 = current;
		}
		return current;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for n: ");
		int n = sc.nextInt();
		
		int resultRecursive = fibonacciRecursive(n);
		System.out.println("Recursive result: " + resultRecursive);
		
		int resultIterative = fibonacciIterative(n);
		System.out.println("Iterative result: " + resultIterative);
		
		sc.close();
	}
}
