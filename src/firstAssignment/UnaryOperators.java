package firstAssignment;

public class UnaryOperators {

	public static void main(String[] args) {
		int a = 100;

		int b = 200;

		int c = 300;

		System.out.println(++a); // 101

		System.out.println(a++); // 101

		System.out.println(a++ + ++b); // 102+201 = 303

		System.out.println(++a - b++); // 103-201 = 98 (?)

		System.out.println(--b * ++c); // 201*301 = 60501

		System.out.println(c++ / ++a); // 201/102 = 2

	}

}