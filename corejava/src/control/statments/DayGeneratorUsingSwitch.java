package control.statments;
import java.util.Scanner;
public class DayGeneratorUsingSwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the day");
		int dayNum = scan.nextInt();
		String day;
		switch (dayNum) {
		case 1:
			day = "monday";
			break;
		case 2:
			day = "tueday";
			break;
		case 3:
			day = "wednesday";
			break;
		case 4:
			day = "thursday";
			break;
		case 5:
			day = "friday";
			break;
		case 6:
			day = "saturday";
			break;
		case 7:
			day = "sunday";
			break;
		default:
			System.out.println("kindly enter the input range of 1 to 7");
			day="not valid";
			break;
		}
		System.out.println ("your day is "+day);
		scan.close();
	}

}
