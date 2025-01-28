package anything;
import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = sc.nextDouble();
		System.out.print("Enter an operator (+,-,*,/): ");
		char operator = sc.next().charAt(0);
		double result;
		switch(operator) {
		case '+':
			result = num1 + num2;
			System.out.print("The result is: "+ result);
			break;
		case '-':
			result = num1 - num2;
			System.out.print("The result is: "+ result);
			break;
		case '*':
			result = num1 * num2;
			System.out.print("The result is: "+ result);
			break;
		case '/':
			if(num2 != 0) {
				result = num1 + num2;
				System.out.print("The result is: "+ result);
			} else {
				System.out.print("Zero cannot be divided");
			}
			break;
			default:
				System.out.print("Invalid Operator");
				break;
		}
		
		sc.close();
	}
}
