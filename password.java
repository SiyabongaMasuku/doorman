package com.smuthirdyear;

import java.util.Scanner;

public class password {

	public static boolean pCheck() {

		boolean status;// = false;

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
			status = false;
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
				status = true;

			} else {// else 2
//				System.out.println("INVALID");
				status = false;
			} // close else 2
		} // close else 1

		return status;

	}

	public static void main(String[] args) {

		while (!pCheck()) {
			System.out.println("Please try again...");

		}
		System.out.println("Password created. Thank you.");
		
		

}// main

}// class
