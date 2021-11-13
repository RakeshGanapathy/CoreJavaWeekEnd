package control.statments;
import java.util.Scanner;
public class VoterApp {
	static int calculateAge(int year) {
		return 2021-year;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your year of birth: ");
		int year = scan.nextInt();
		int age = calculateAge(year);
		if(age>=18) {
			System.out.println("Welcome you are eligible to vote");
		}
		else {
			System.out.println(" you are not eligible to vote this year");
			int requiredYear =  18-age;
			System.out.println("you are eligible after "+requiredYear+" year");
		}
		scan.close();
	}
}
