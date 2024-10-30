package firstAssignment;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int a = 30;

		int b = 20;

		System.out.println("Before Swapping");

		System.out.println("a=" + a);

		System.out.println("b=" + b);

		a = a + b; // a = 50

		b = a - b; // b = 30

		a = a - b; // a = 20

		System.out.println("After Swapping");

		System.out.println("a=" + a);

		System.out.println("b=" + b);

	}

}