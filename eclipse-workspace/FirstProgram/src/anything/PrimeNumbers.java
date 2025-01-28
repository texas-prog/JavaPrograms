package anything; 
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a ");
		int limit = sc.nextInt();
		
		if (limit < 2) {
			System.out.println("There are no Prime numbers before: " + limit);
		} else {
			System.out.println("Prime numbers up to " + limit + ":");
			for (int i=2; i <= limit; i++) {
				if(isPrime(i)) {
					System.out.print(i + " ");
				}
			}
		}
		sc.close();
	}
	
	private static boolean isPrime(int number) {
		if (number <= 1) return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) return false;
		}
		return true;
	}
}
