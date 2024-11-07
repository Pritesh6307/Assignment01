package practicefiles;

public class ArithmaticDemoOne {

	public static void main(String[] args) {
		ArithmaticDemoOne ado = new ArithmaticDemoOne();
		
		ado.add();
		ado.mult();
	}
	public void add() {
		int a = 10;
		int b = 20;
		int add = a+b;
		System.out.println(add);
	}
	public void mult() {
		int a = 36;
		int b = 32;
		int mult = a*b;
		System.out.println(mult);
	}
}