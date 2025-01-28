package anything;
import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi > 25) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("Your weight is average.");
        }
        sc.close();
    }
}