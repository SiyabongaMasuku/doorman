import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String sPass;
		int sml=0;//to hold small letters count
		int cap=0;//to hold capital letters count
		int dig=0;//to hold digit count
		System.out.println("Enter pass: ");
		sPass = in.nextLine();
		in.close();
		int pl;//to hold the length of the string password
		pl = sPass.length();
		if(pl > 6 || pl < 6) {
			System.out.println("INVALID");			
		}
		else {
			for (int i=0; i<pl;i++) {
				char letter = sPass.charAt(i);
				if(Character.isLowerCase(letter)) {
					sml++;
				}
				if(Character.isUpperCase(letter)) {
					cap++;
				}
				if(Character.isDigit(letter)) {
					dig++;
				}
				
			} //close for loop
			if(cap ==2 && sml == 2 && dig==2) {
				System.out.println("VALID");
			}
			else {
				System.out.println("INVALID");
			}
		}
	}

}
