package control.statments;
import java.util.Scanner;
import com.app.mod.feature.AreaCalc;
public class SpaceCalculator {
	public static void main(String[] args) {
		System.out.println("Calculate the area for\n1.Square\n2.Circle\n3.Rectangle");
		System.out.println("Kindly enter the shape");
		Scanner scan = new Scanner(System.in);
		String shape = scan.next().toLowerCase();
		double result = 0;
		switch (shape) {
		case "square":
			System.out.println("kindly enter the side measurement");
			double side = scan.nextDouble();
			result = AreaCalc.calculateSquareArea(side);
			break;
		case "circle":
			System.out.println("kindly enter the radius measument");
			double radius = scan.nextDouble();
			result = AreaCalc.calculateCircleArea(radius);
			break;
		case "rectangle":
			System.out.println("kindly enter the length measument");
			double length = scan.nextDouble();
			System.out.println("kindly enter the breadth measument");
			double breadth = scan.nextDouble();
			result = AreaCalc.calculateAreaOfRectangle(length, breadth);
			break;
		default :
			System.out.println("kindly enter the valid shapes");
			System.exit(0);// terminate the program 
		}
		System.out.println("the area of "+shape+" is "+result);
		scan.close();
	}
}