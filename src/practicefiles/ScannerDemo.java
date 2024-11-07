package practicefiles;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value");
		int a = sc.nextInt();
		System.out.println("Enter Second Value");
		int b = sc.nextInt();
		int ad = a+b;
		System.out.println("Addition of Two Number =" + ad);
	}

}
