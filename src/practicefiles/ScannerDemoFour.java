package practicefiles;

import java.util.Scanner;

public class ScannerDemoFour {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value");
		int w = sc.nextInt();
		System.out.println("Enter Second Number");
		int l = sc.nextInt();
		int AoR = w*l;
		System.out.println("Area of Rectangle = " + AoR);

	}

}
