package com.app.mod.feature;

public class AreaCalc {

	public static double calculateSquareArea(double side) {
		//  Math.pow(side, 2) ; 
		double result = side*side;
		return result;
	}
	
	public static double calculateCircleArea(double rad) {
		return 3.14*rad*rad;
	}
	
	static double calculatePerimeterOfRectangle(int length, int breadth) {
		double result = 2*(length+breadth);
		return result ;
	}
	
	public static double calculateAreaOfRectangle(double length, double breadth) {
		return length*breadth ;
	}
	
	
}
