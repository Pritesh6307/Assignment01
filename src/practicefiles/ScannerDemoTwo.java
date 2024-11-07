package practicefiles;

import java.util.Scanner;

public class ScannerDemoTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value");
		int a = sc.nextInt();
		System.out.println("Enter Second Value");
		int b = sc.nextInt();
		int sub = a-b;
		int add = a+b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b;
		System.out.println("Subtraction = " + sub);
		System.out.println("Addition  = " + add);
		System.out.println("Multiplication = " + mul);
		System.out.println("Division = " + div);
		System.out.println("Module = " + mod);

	}

}
