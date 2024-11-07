package practicefiles;

public class ArithmaticDemo {
	public static void main(String[] args) {
		ArithmaticDemo ad = new ArithmaticDemo();

		ad.add();
		ad.mult();
		ad.sub();
		ad.div();

	}
	public void add(){
		int a = 10;
		int b = 20;
		int add = a+b;
		System.out.println(add);
	}
	public void mult() {
		int a = 20;
		int b = 30;
		int mult = a*b;
		System.out.println(mult);
	}
	public void sub() {
		int a = 32;
		int b = 21;
		int sub = a-b;
		System.out.println(sub);
	}
	public void div() {
		int a = 30;
		int b = 15;
		int div = a/b;
		System.out.println(div);
	}
}





