package com.app.mod.feature;

public class ObjectCreation {
	// instance variable
	private int iValue ;
	void display() {
		System.out.println("display method");
	}
	public static void main(String[] args) {
		ObjectCreation ref = new ObjectCreation();
		ref.iValue=34;
		System.out.println(ref);
		// objectname.variable name
		System.out.println(ref.iValue);
		ref = new ObjectCreation();
		System.out.println(ref);
		System.out.println(ref.iValue);
		ref.display();
	}
}
