package control.statments;
import java.util.Scanner;
public class DayNameGenerator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the day");
		int dayNum = scan.nextInt();
		String day ;
		if(dayNum ==1) {
			day="Sunday";
		}
		else if(dayNum == 2) {
			day="Sunday";
		}
		else if(dayNum == 3) {
			day="tueday";
		}
		else if(dayNum == 4) {
			day="Wednesday";
		}
		else if(dayNum == 5) {
			day="thursday";
		}
		else if(dayNum == 6) {
			day="friday";
		}
		else {
			day="saturday";
		}
		System.out.println("its "+day);
		scan.close();
	}
}
