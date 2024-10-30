package firstAssignment;

public class AlphabetDigitCharacter {

	public static void main(String[] args) {
		char ch = 'A';

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("Character is Alphabet");

		}

		else if

		(ch >= '0' || ch <= '9') {

			System.out.println("Character is Digit");

		}

		else {

			System.out.println("Special Character");

		}

	}// else print nahi ho raha

}