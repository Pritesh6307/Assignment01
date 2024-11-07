package practicefiles;

public class RelationalOperatorDemo {

	public static void main(String[] args) {
		int a = 200;
		int b = 300;
		int c = 600;
		int d = 800;
		System.out.println(a > b); //f
		System.out.println(a == b); //f
		System.out.println(a != b); //t
		System.out.println(b > a); //t
		System.out.println(c < d); //t
		System.out.println(d > a); //t
		System.out.println(c > a); //t
		System.out.println(a == d); //f
	}

}
