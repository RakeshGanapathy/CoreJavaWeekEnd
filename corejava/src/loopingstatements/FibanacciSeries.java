package loopingstatements;

import java.util.Scanner;

public class FibanacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input");
		int input = scan.nextInt();
		int f1=0,f2=1,f3=0;
		
		System.out.print(f1+" "+f2+" ");
		for(int i=0;i<=input-3;i++) {
			f3= f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}
		scan.close();
	}

}
