package loopingstatements;

import java.util.Scanner;

public class ArmStrongNumber {
	private static int findNoOfDigits(int input) {
		int digits = 0;
		while (input != 0) {
			input /= 10;
			digits++;
		}
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input");
		int input = scan.nextInt();
		int noOfDigits = findNoOfDigits(input);
		int tempDigit = 0, compareValue = input;
		double result = 0;
		while (input != 0) {
			tempDigit = input % 10;
			input /= 10;
			result += Math.pow(tempDigit, noOfDigits);
		}
		String answer = compareValue == result ? 
				"an ArmStrong" : "NotArmStrong";
		System.out.println("your input is of " + 
				noOfDigits + " digits and The " + 
				"input is " + answer + " Number");
		scan.close();
	}
}
