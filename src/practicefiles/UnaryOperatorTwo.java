package practicefiles;

public class UnaryOperatorTwo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(++a - a--); //11-11= 0
		System.out.println(a++ - ++a); //10-12=-2
		System.out.println(b-- + ++a); //20+13=33
		System.out.println(++b + b--); //20+20=40
		System.out.println(--b + a--); //18+13=31
		System.out.println(--a + ++b); //11+19=30

	}

}
