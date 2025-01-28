package anything;
import java.util.Scanner;

public class ArrayOperations {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the Numbers of the array: ");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		int min = array[0];
		int max = array[0];
		int sum = array[0];
		for(int num : array) {
			if(num < min) {
				min = num;
			} if(num > max) {
				max = num;
			}
			sum += num;
		}
		System.out.println("Minimum Number: " + min);
		System.out.println("Maximum Number: " + max);
		System.out.println("Sum of all Numbers: " + sum);
		sc.close();
	}
}
