package control.statments;
import java.util.Scanner;
public class SalaryCalculator {
	static int calculateSalary(int days) {
		return days * 500;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your no of working days");
		int days = scan.nextInt();
		System.out.println("have you met your target ? yes/no");
		String status = scan.next();
		int salary = calculateSalary(days);
		if (status.startsWith("y")||
				status.startsWith("Y")) {
			salary += 5000;
		}
		System.out.println("your total salary is " + salary);
		scan.close();
	}
}
