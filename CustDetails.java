import java.util.HashMap;
import java.util.Scanner;

class CustDetails {
	/*
	 * Defining HashMap
	 */
	HashMap<String, CustDetails> custset3 = new HashMap<String, CustDetails>();

	/*
	 * Defining Class variables
	 */
	private String iCustName;
	private String iCustAcct;
	private String iCustMob;
	private String iCustGovtId;
	private double iCustBalAmt;
	private double iCustSpntAmt;
	private String iCustOtp;
	private String iCustpwd;

	/*
	 * Getters & Setters - Start
	 */
	public String getiCustName() {
		return iCustName;
	}

	public void setiCustName(String iCustName) {
		this.iCustName = iCustName;
	}

	public String getiCustAcct() {
		return iCustAcct;
	}

	public void setiCustAcct(String iCustAcct) {
		this.iCustAcct = iCustAcct;
	}

	public String getiCustMob() {
		return iCustMob;
	}

	public void setiCustMob(String iCustMob) {
		this.iCustMob = iCustMob;
	}

	public String getiCustGovtId() {
		return iCustGovtId;
	}

	public void setiCustGovtId(String iCustGovtId) {
		this.iCustGovtId = iCustGovtId;
	}

	public double getiCustBalAmt() {
		return iCustBalAmt;
	}

	public void setiCustBalAmt(double iCustBalAmt) {
		this.iCustBalAmt = iCustBalAmt;
	}

	public double getiCustSpntAmt() {
		return iCustSpntAmt;
	}

	public void setiCustSpntAmt(double iCustSpntAmt) {
		this.iCustSpntAmt = iCustSpntAmt;
	}

	public String getiCustOtp() {
		return iCustOtp;
	}

	public void setiCustOtp(String iCustOtp) {
		this.iCustOtp = iCustOtp;
	}

	public String getiCustpwd() {
		return iCustpwd;
	}

	public void setiCustpwd(String iCustpwd) {
		this.iCustpwd = iCustpwd;
	}

	/*
	 * Getters & Setters - End
	 */

	/*
	 * Constructor method()
	 */
	public void CustDetails() {
		this.iCustName = iCustName;
		this.iCustAcct = iCustAcct;
		this.iCustMob = iCustMob;
		this.iCustGovtId = iCustGovtId;
		this.iCustBalAmt = iCustBalAmt;
		this.iCustSpntAmt = iCustSpntAmt;
		this.iCustOtp = iCustOtp;
		this.iCustpwd = iCustpwd;

		System.out.println("Constructor running");
	}

	/*
	 * toString()
	 */

	@Override
	public String toString() {
		return "CustDetails [iCustName=" + iCustName + ", iCustAcct=" + iCustAcct + ", iCustMob=" + iCustMob
				+ ", iCustGovtId=" + iCustGovtId + ", iCustBalAmt=" + iCustBalAmt + ", iCustSpntAmt=" + iCustSpntAmt
				+ ", iCustOtp=" + iCustOtp + ", iCustpwd=" + iCustpwd + "]";
	}

	/*
	 * User define method for input validation - isStringOnlyAlphabet
	 */
	public static boolean isStringOnlyAlphabet(String str) {
		return ((!str.equals("")) && (str != null) && (str.matches("^[a-zA-Z]*$")));
	}

	/*
	 * User define method for input validation - isNumeric
	 */
	public static boolean isNumeric(String number) {
		if (number == null) {
			return false;
		}
		try {
			Double.parseDouble(number);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	/*
	 * User define method for input validation - isAlphaNumeric
	 */
	public static boolean isAlphaNumeric(String text3) {
		return text3 != null && text3.matches("^[a-zA-Z0-9]*");
	}

	/*
	 * Input field validation - Customer Name
	 */
	public void CustNameEdit() {
		System.out.println();
		System.out.println("Enter Customer Name ");
		Scanner input1 = new Scanner(System.in);
		String text1 = input1.nextLine();

		if (!isStringOnlyAlphabet(text1)) {
			System.out.println();
			System.out.println("Customer Name contains incorrect character");
			CustNameEdit();
		} else {
			setiCustName(text1);
		}
	}

	/*
	 * Input field validation - Customer Account number
	 */
	public void CustAcctEdit() {
		System.out.println();
		System.out.println("Enter Customer Account ");
		Scanner input2 = new Scanner(System.in);
		String text2 = input2.nextLine();

		if (!isNumeric(text2)) {
			System.out.println();
			System.out.println("Account number should be numeric. Please retry!");
			CustAcctEdit();
		} else if (text2.length() != 10) {
			System.out.println();
			System.out.println("Customer Account must be 10 digits. Please retry!");
			CustAcctEdit();
		} else {
			setiCustAcct(text2);
		}
	}

	/*
	 * Input field validation - Customer Mobile number
	 */
	public void CustMobEdit() {
		System.out.println();
		System.out.println("Enter Customer Mobile number ");
		Scanner input3 = new Scanner(System.in);
		String text3 = input3.nextLine();
		if (!isNumeric(text3)) {
			System.out.println();
			System.out.println("Customer Mobile number should be numeric. Please retry!");
			CustMobEdit();
		} else if (text3.length() != 10) {
			System.out.println();
			System.out.println("Customer Mobile number should be 10 digits. Please retry!");
			CustMobEdit();
		} else {
			setiCustMob(text3);
		}
	}

	/*
	 * Input field validation - Customer Govt. Id number
	 */
	public void CustGovtIdEdit() {
		System.out.println();
		System.out.println("Enter Customer Govt Id number ");
		Scanner input4 = new Scanner(System.in);
		String text4 = input4.nextLine();

		boolean isAlphaNumeric = text4 != null && text4.chars().allMatch(Character::isLetterOrDigit);

		if (!isAlphaNumeric) {
			System.out.println();
			System.out.println("Customer Govt Id should be Alphanumeric. Please retry!");
			CustGovtIdEdit();
		} else {
			setiCustGovtId(text4);
		}
	}

	/*
	 * Input field validation - Customer OTP
	 */
	public void CustOtpEdit() {
		System.out.println();
		System.out.println("Enter the OTP received to create the Wallet");
		Scanner input5 = new Scanner(System.in);
		String text5 = input5.nextLine();

		if (!isNumeric(text5)) {
			System.out.println();
			System.out.println("OTP should be numeric and 6 digits. Please retry!");
			CustOtpEdit();
		} else if (text5.length() != 6) {
			System.out.println();
			System.out.println("OTP should be 6 digits. Please retry!");
			CustOtpEdit();
		} else {
			setiCustOtp(text5);
		}
	}

	/*
	 * Input field validation - Customer Password
	 */
	public void CustpwdEdit(String password) {
		System.out.println();
		System.out.println("Enter the password to create the Wallet ");
		Scanner input6 = new Scanner(System.in);
		String text6 = input6.nextLine();

		boolean isAlphaNumeric = text6 != null && text6.chars().allMatch(Character::isLetterOrDigit);

		if (!isAlphaNumeric) {
			System.out.println();
			System.out.println("Password should be Alphanumeric. Please retry!");
			CustpwdEdit(text6);
		} else {
			CustpassEdit(text6);
		}
	}

	/*
	 * Input field validation extended - Customer Password
	 */
	public void CustpassEdit(String password) {
		System.out.println();
		System.out.println("Please confirm the password again ");
		Scanner input16 = new Scanner(System.in);
		String text16 = input16.nextLine();
		String oldpwd = password;
		// System.out.println("password:" + password + " " + text16);

		boolean isAlphaNumeric = text16 != null && text16.chars().allMatch(Character::isLetterOrDigit);

		if (!isAlphaNumeric) {
			System.out.println();
			System.out.println("Password should be Alphanumeric. Please retry!");
			CustpassEdit(oldpwd);
		} else if (!password.equals(text16)) {
			System.out.println("Password does not match. Please retry!");
			CustpassEdit(oldpwd);
		} else {
			setiCustpwd(text16);
		}
	}

	/*
	 * Initializing field - Customer Balance Amount
	 */
	public void CustBalAmtEdit() {
		int BalAmt = 0;
		setiCustBalAmt(BalAmt);
	}

	/*
	 * Initializing field - Customer Spent/Transferred Amount
	 */
	public void CustSpntAmtEdit() {
		int BalAmt = 0;
		setiCustSpntAmt(BalAmt);
	}

	/*
	 * Display Sub Menu options
	 */
	public void operation(HashMap<String, CustDetails> custset) {
		custset3 = custset;
		System.out.println();
		System.out.println("Sub Menu: Select one of the below Options:");
		System.out.println("------------------------------------------");
		System.out.println("1. Load money into your Wallet");
		System.out.println("2. Perform money transfer");
		System.out.println("3. View account details");
		System.out.println("4. Go back to main menu");
		System.out.println();

		Scanner scanner2 = new Scanner(System.in);
		int option2 = scanner2.nextInt();
		try {
			/*
			 * Handling Load money into Wallet : Option 1
			 */
			if (option2 == 1) {
				loadMoney();
			}
			/*
			 * Money Transfer : Option 2
			 */
			else if (option2 == 2) {
				System.out.println();
				// System.out.println(custset.keySet());
				CustDetails custdetails = new CustDetails();

				/*
				 * Validating the from account balance
				 */
				if (iCustBalAmt == 0) {
					System.out.println();
					System.out
							.println("Your account Balance is low(" + iCustBalAmt + ") to initiate the Fund transfer");
					System.out.println();
					System.out.println("Please load money into the Account");
					operation(custset);
				}

				/*
				 * Validating the existence of the mobile number in the Wallet
				 */
				System.out.println("Enter the mobile number you want to do fund transfer");
				Scanner scanner22 = new Scanner(System.in);
				String fundmobile = scanner22.nextLine();

				/*
				 * Validating the primitive type of the mobile number
				 */
				if (!isNumeric(fundmobile)) {
					System.out.println();
					System.out.println("Invalid mobile number. Please retry!");
					operation(custset);
				}
				/*
				 * Validating user input length of the mobile number
				 */
				else if (fundmobile.length() != 10) {
					System.out.println();
					System.out.println("Fund transfer mobile number should be 10 digits. Please retry!");
					operation(custset);
				} else {
					System.out.println();
				}
				// System.out.println("fundmobile " + fundmobile);
				// CustDetails custdetails = new CustDetails();
				custdetails = (CustDetails) custset.get(fundmobile);
				// System.out.println("custdetails.iCustBalAmt" + custdetails.iCustMob);
				// System.out.println("iCustMob" + iCustMob);

				/*
				 * Validating the from & to mobile number in the Wallet
				 */
				if (fundmobile.equals(iCustMob)) {
					System.out.println();
					System.out.println("Fund transfer cannot be done within same account");
					operation(custset);
				}

				System.out.println();
				System.out.println("Enter amount to perform fund transfer from your Wallet");
				Scanner scanner3 = new Scanner(System.in);
				double spntAmt = scanner3.nextDouble();

				/*
				 * Validating the from account balance against the Fund transfer amount
				 */
				if (iCustBalAmt < spntAmt) {
					System.out.println();
					System.out.println("You dont have enough fund to transfer");
					System.out.println("Your Account Balance = " + iCustBalAmt);
					System.out.println("Fund transfer initiated = " + spntAmt);
					operation(custset);
				}
				/*
				 * Validating the existence of the to mobile number in the Wallet
				 */
				else if (!custset.containsKey(fundmobile)) {
					System.out.println();
					System.out.println("Fund transfer mobile number not found " + fundmobile);
					System.out.println();
					operation(custset);
				} else
					// System.out.println(custdetails.iCustMob);
					// System.out.println(custdetails.iCustBalAmt);
					/*
					 * Perform Calculation 1. Subtract money from the From Account 2. Add Money into
					 * the To Account 3. Display the balance details of the account
					 */
					iCustSpntAmt = iCustSpntAmt + spntAmt;
				iCustBalAmt = iCustBalAmt - spntAmt;
				setiCustSpntAmt(iCustSpntAmt);
				setiCustBalAmt(iCustBalAmt);

				custdetails.iCustBalAmt = custdetails.iCustBalAmt + spntAmt;
				custdetails.setiCustBalAmt(custdetails.iCustBalAmt);
				System.out.println();
				System.out.println(
						spntAmt + " has been transferred from mobile " + iCustMob + " To " + custdetails.iCustMob);
				System.out.println();
				System.out.println("Your account balance on " + iCustMob + " is : " + iCustBalAmt);
				System.out.println();
				operation(custset);
			}
			/*
			 * Account detail view : Option 3
			 */
			else if (option2 == 3) {
				viewAccount();
			}
			/*
			 * Go Back to previous Menu : Option 4
			 */
			else if (option2 == 4) {
				System.out.println();
			} else {
				/*
				 * Handling invalid options
				 */
				System.out.println("Invalid option, Please enter valid value");
				System.out.println();
				operation(custset);
			}
			/*
			 * Handling Exceptions
			 */
		} catch (Exception e) {
			System.out.println("Invalid input. Please enter proper value ");
			operation(custset);
		}
	}

	/*
	 * Method - Load Money into the Wallet
	 */
	public void loadMoney() {
		System.out.println();
		System.out.println("Enter amount to add money into your Wallet");
		Scanner double1 = new Scanner(System.in);
		double loadAmt = double1.nextDouble();

		/*
		 * Rejecting the fund transfer in case the amount is greater than 20000 INR
		 */
		if (loadAmt > 20000.00) {
			System.out.println();
			System.out.println("Cannot load more than 20000 INR, Please retry with less fund");
			loadMoney();
		}
		/*
		 * Rejecting the fund transfer in case the fund transfer amount is 0.00 INR
		 */
		else if (loadAmt == 00.00) {
			System.out.println();
			System.out.println("Amount entered is zero. Please enter valid amount");
			loadMoney();
			/* 
			 *  Calculation - Adding money into the Wallet & display Account Balance
			 */
		} else {
			iCustBalAmt = iCustBalAmt + loadAmt;
			setiCustBalAmt(iCustBalAmt);
			System.out.println();
			System.out.println(loadAmt + " has been successfully loaded into your Wallet " + iCustMob);
			System.out.println();
			System.out.println("Your account balance on " + iCustMob + " is : " + iCustBalAmt);
			System.out.println();
			operation(custset3);
		}
	}
	/* 
	 *  Display - Account details 
	 */
	public void viewAccount() {
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println("Customer Name               : " + getiCustName());
		System.out.println("Customer Account            : " + getiCustAcct());
		System.out.println("Customer Mobile number      : " + getiCustMob());
		System.out.println("Customer Govt Id number     : " + getiCustGovtId());
		System.out.println("Customer Balance Amount     : " + getiCustBalAmt());
		System.out.println("Customer Transferred Amount : " + getiCustSpntAmt());
		System.out.println("------------------------------------------------------");
		operation(custset3);
	}
}
