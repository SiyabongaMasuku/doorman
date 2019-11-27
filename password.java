import java.util.Scanner;

public class password {

	public static boolean pCheck() {

		boolean valid;// = false;

		Scanner in = new Scanner(System.in);
		int sml = 0;// to hold small letters count
		int cap = 0;// to hold capital letters count
		int dig = 0;// to hold digit count
		System.out.println("Enter pass: ");
		String sPass, cleanbuffer;
		sPass = in.nextLine();
//		while (in.hasNext()) {
//			cleanbuffer = in.nextLine();
//			System.out.println("******");
//		}

//		in.close();
		int pl;// password length
		pl = sPass.length();
		if (pl > 6 || pl < 6) {
//			System.out.println("INVALID");
			valid = false;
		} else { // else 1
			for (int i = 0; i < pl; i++) {
				char letter = sPass.charAt(i);
				if (Character.isLowerCase(letter)) {
					sml++;

				}
				if (Character.isUpperCase(letter)) {
					cap++;

				}
				if (Character.isDigit(letter)) {
					dig++;

				}

			} // close for loop
			if (cap == 2 && sml == 2 && dig == 2) {
//				System.out.println("VALID");
				valid = true;

			} else {// else 2
//				System.out.println("INVALID");
				valid = false;
			} // close else 2
		} // close else 1

		return valid;

	}

	public static void main(String[] args) {

		int tryCount = 5; // try count to enter the password

		while (!pCheck() && tryCount != 1) {
//			while() {
			tryCount--;
			if (tryCount > 1) {
				System.out.println(tryCount + " chances. Please try again...");
			} else if (tryCount == 1) {
				System.out.println("Last chance. Please try again!");
			}
//			}
		}

		System.out.println("********************");

	}// main

}// class
