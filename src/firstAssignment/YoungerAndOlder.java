package firstAssignment;

import java.util.Scanner;

public class YoungerAndOlder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Person Age");

		int a = sc.nextInt();

		System.out.println("Enter 2nd Person Age");

		int b = sc.nextInt();

		System.out.println("Enter 3rd Person Age");

		int c = sc.nextInt();

		if (a > b && a > c) {

			System.out.println("1st Person is older");

		} else if (b > a && b > c) {

			System.out.println("2nd person is Older");

		}

		else {

			System.out.println("3rd Person is Older");

		}

		if (a < b && a < c) {

			System.out.println("1st person is Younger");

		}

		else if (b < a && b < c) {

			System.out.println("2nd person is Younger");

		}

		else {

			System.out.println("3rd Person is Younger");

		}

	}
}