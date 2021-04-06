
/*
 This program will take a user's password as input and output the strength of that password
 Tyler Henry
 panther ID: 900-78-8844
 */
import java.util.*;
public class Henry_Tyler {
	//method for reading lower, upper, and digits from user input
	public static void pwStrength(String input) {
		int n = input.length();
		boolean hasLower = false, hasUpper = false, hasDigit = false;
		for(char i : input.toCharArray()) {
			if(Character.isLowerCase(i))
				hasLower = true;
			if(Character.isUpperCase(i))
				hasUpper = true;
			if(Character.isDigit(i))
				hasDigit = true;
		}
		//if and else ifs that determine whether the password is strong, fair, or weak
		if(hasDigit && hasLower && hasUpper && n>=5 && n<=7)
			System.out.print(input + " is a strong password");
		else if (hasLower && hasUpper || hasDigit && n>=5 && n<=7)
			System.out.print(input + "is a fair password");
		else if(n>=5 && n<=7)
			System.out.print(input + " is a Weak password");
	}
	//main method with scanner class and method calls
	public static void main(String[] args) {
		char ch = 'y';
		//while loop to prompt user after initial input
		while(ch =='y'){
		System.out.println("Please enter your password ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		if(input.length() < 5 || input.length() > 7) {
			System.out.println("Error enter password with 5 - 7 characters");
		}
		pwStrength(input);
		System.out.println("\nWould you like to continue y/n ");		
		ch = in.nextLine().charAt(0);		
		}
		
	

	}
}
