package practicefiles;

import java.util.Scanner;

public class ScannerDemoThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value");
		int P = sc.nextInt();
		System.out.println("Enter Second Value");
		int R = sc.nextInt();
		System.out.println("Enter Third Value");
		int T = sc.nextInt();
		int SI = (P*R*T)/100;
		System.out.println("Simple Interest = " + SI);

	}

}
