package com.app.mod.feature;
import java.util.Scanner;
public class CalcImpl {
	static void displayMethod() {
		System.out.println("void method need not to return any value "
				+ "void method does not need a return statement");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi Dude");
		//Static method from the same class
		displayMethod();
		// static method from different class
		System.out.println("Enter the side");
		double side = scan.nextDouble();
		double areaOfSquare = AreaCalc.calculateSquareArea(side);
		System.out.println(areaOfSquare);
		System.out.println("Enter the length");
		int length = scan.nextInt();
		System.out.println("Enter the breadth");
		int breadth = scan.nextInt();
		double perimeterOfRectangle = 
				AreaCalc.calculatePerimeterOfRectangle(length, breadth);
		System.out.println(perimeterOfRectangle);
		scan.close();
	}

}
