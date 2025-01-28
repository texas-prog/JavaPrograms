package anything;
import java.util.Scanner;

public class SpeedLimit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Speed of the Vehicle: ");
		int speed = sc.nextInt();
		int fine;
		if(speed <= 60) {
			fine = 0;
		} else if (speed <= 80) {
			fine = 100;
		} else if (speed <= 100) {
			fine = 250;
		} else {
			fine = 500;
		}
		
		if (fine == 0) {
			System.out.print("No Fine");
		} else {
			System.out.print("The fine is: " + fine);
		}
		sc.close();
	}

}
