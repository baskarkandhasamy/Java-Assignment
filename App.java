import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
		 * Object creation for the Class CustDetail
		 */
		CustDetails details = new CustDetails();
		/*
		 * HashMap creation with Mobile number as Key and CustDetails as Value
		 */
		HashMap custset = new HashMap<String, CustDetails>();

		System.out.println();

		System.out.println("*************************************");
		System.out.println("*** WELCOME TO THE DIGITAL WALLET ***");
		System.out.println("*************************************");

		int value = 0;
		String strpassword = " ";
		/*
		 * Loop until exit of the program
		 */
		do {
			Scanner scanner = new Scanner(System.in);

			/*
			 * Main Menu display
			 */
			CustDetails custdetails = new CustDetails();
			System.out.println();
			System.out.println("MAIN MENU: SELECT ONE OF THE BELOW OPTIONS");
			System.out.println("------------------------------------------");
			System.out.println("1. Sign in for a new Wallet");
			System.out.println("2. Login with existing Wallet");
			System.out.println("3. QUIT the application");
			System.out.println();

			/*
			 * Handling the main menu options
			 */
			try {
				value = scanner.nextInt();
				/*
				 * New Wallet Sign in
				 */
				if (value == 1) {

					/* Calling each method to get the input from User */
					custdetails.CustNameEdit();
					custdetails.CustAcctEdit();
					custdetails.CustMobEdit();
					custdetails.CustGovtIdEdit();
					custdetails.CustOtpEdit();
					custdetails.CustpwdEdit(strpassword);
					custdetails.CustBalAmtEdit();
					custdetails.CustSpntAmtEdit();

					System.out.println();

					/*
					 * Adding elements into the HashMap
					 */

					details = (CustDetails) custset.get(custdetails.getiCustMob());

					/*
					 * Validating the mobile number in the HashMap to check whether the Wallet account
					 * exist in the system
					 */
					if (custset.containsKey(custdetails.getiCustMob())) {
						System.out.println();
						System.out.println("New Wallet not created");
						System.out.println();
						System.out.println("Mobile number " + custdetails.getiCustMob() + " already exist in the system");
						System.out.println();
						System.out.println("Please Login with the existing credentials");
						System.out.println();
					} 
					else {
						custset.put(custdetails.getiCustMob(), custdetails);

						System.out.println();
						System.out.println("You have been successfully Signed into the Digital Wallet");
						/*
						 * Display sub menu options
						 */
						custdetails.operation(custset);
					}
					/*
					 * Existing customer log in
					 */
				} else if (value == 2) {
					System.out.println();
					System.out.println("Please keep your mobile number and password to login");
					/*
					 * Validating the existence of the mobile number in the Wallet
					 */
					System.out.println();
					System.out.println("Please provide your mobile number");
					Scanner scanner1 = new Scanner(System.in);
					String mobilenum = scanner1.nextLine();

					System.out.println();
					System.out.println("Please provide the password");
					Scanner scanner11 = new Scanner(System.in);
					String password = scanner11.nextLine();

					details = (CustDetails) custset.get(mobilenum);

					/*
					 * Validating the mobile number in the HashMap
					 */
					if (custset.containsKey(mobilenum)) {
						String password1 = details.getiCustpwd();
						/*
						 * Validating the user entered password
						 */
						if (password.equals(password1)) {
							System.out.println();
							System.out.println("Welcome! You have been successfully logged into your account");
							details.operation(custset);
						} else {
							System.out.println();
							System.out.println("Incorrect password, Please try again");
						}
					} else {
						System.out.println();
						System.out.println("No Wallet found under the mobile number entered");
						System.out.println();
						System.out.println("Please try again with valid mobile number");
						System.out.println();
					}
					/*
					 * Exit from the Application
					 */
				} else if (value == 3) {
					System.out.println("You have been successfully exit from the application");
					System.out.println();
					System.out.println("Thank you for using Digital Wallet. See you soon!");
					value = 3;
					/*
					 * Handling the invalid option
					 */
				} else {
					System.out.println("Invalid option, Please enter valid value");
					System.out.println();
				}
				/*
				 * Handling the exceptions
				 */
			} catch (Exception e) {
				System.out.println("Invalid input. Please check the input");
			}
		} while (value != 3);
	}
}