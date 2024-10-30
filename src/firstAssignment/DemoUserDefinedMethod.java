package firstAssignment;

public class DemoUserDefinedMethod {

	public static void main(String[] args) {
		DemoUserDefinedMethod dm = new DemoUserDefinedMethod();

		dm.add();
		dm.sub();
		dm.mult();
		dm.div();
	}

	public void add() {

		int a = 10;
		int b = 20;
		int addition = a + b;
		System.out.println(addition);
	}

	public void sub() {

		int a = 200;
		int b = 100;
		int subtraction = a - b;
		System.out.println(subtraction);
	}

	public void mult() {

		int a = 10;
		int b = 20;
		int multipliction = a * b;
		System.out.println(multipliction);
	}

	public void div() {

		int a = 60;
		int b = 30;
		int division = a / b;
		System.out.println(division);

	}
}