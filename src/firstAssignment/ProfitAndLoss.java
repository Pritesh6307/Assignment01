package firstAssignment;

public class ProfitAndLoss {

	public static void main(String[] args) {
		int CP = 10;
		int SP = 15;
		if (SP > CP) {
			System.out.println("We are in Profit");

		}

		else if (SP == CP) {
			System.out.println("No Profit No Loss");

		} else {
			System.out.println("We are in Loss");

		}

	}
}