package anything;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        double hra = 0.20 * basicSalary; 
        double da = 0.10 * basicSalary;  
        double pf = 0.12 * basicSalary; 
        double professionalTax = 500; 
        double netSalary = (basicSalary + hra + da) - (pf + professionalTax);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("PF (12%): " + pf);
        System.out.println("Professional Tax: " + professionalTax);
        System.out.println("Net Salary: " + netSalary);

        scanner.close();
    }
}
