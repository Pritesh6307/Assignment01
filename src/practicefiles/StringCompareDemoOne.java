package practicefiles;

public class StringCompareDemoOne {

	public static void main(String[] args) {
		String str1="pritesh";
		String str2="PRITESH";
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are not Equal");
		}

	}

}