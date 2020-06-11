import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DigWallet {
	
	static ArrayList<Login> set1 = new ArrayList<Login>();
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args) throws Exception {	
		Login_Menu();

	}
	public static void Login_Menu() throws Exception {
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("           Welcome To DigiWallet                         ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("A. Sign up or Create a Wallet");
		System.out.println("B. Login");
		System.out.println("C. Close the program");
		System.out.println("------------------------------------------------------------------------------");

		System.out.println("Enter a Input");
		Scanner rec = new Scanner(System.in);
		String selection = rec.nextLine();
		while (!"A".equalsIgnoreCase(selection) && !"B".equalsIgnoreCase(selection)
				&& !"C".equalsIgnoreCase(selection)) {
			System.out.println("Invalid Choice");
			System.out.println("Enter a Valid input");
			selection = rec.nextLine();
		}
		if ("A".equalsIgnoreCase(selection)) {
			Validation();
		}
		if ("B".equalsIgnoreCase(selection)) {
			LoginPage.LoginData();
		}
		if ("C".equalsIgnoreCase(selection)) {
			System.out.println("Program Ended");
			System.exit(0);
		} else {
			System.out.println("Returning to Main Menu");
			Login_Menu();
		}
	}
	
	
	
	public static void Validation() throws Exception  {
		Scanner console = new Scanner(System.in);
		boolean nameval = false;
		String ValName = null;
		while(nameval == false) {
			System.out.println("Enter Name:");
			String Name = console.nextLine();
			Name = ValidationClass.NameValidator(Name);
			nameval = ValidationClass.NameNullMethod(Name,nameval);
			ValName = Name;
		}
		nameval = false;
		String ValAccNum= null;
		while(nameval == false) {
			System.out.println("Enter Account Number(Greater than 10 digits):");
			String AccNum = console.next();
			AccNum = ValidationClass.AccNumValidator(AccNum);
			nameval=ValidationClass.NullMethod(AccNum,nameval);
			ValAccNum = AccNum;
		}
		nameval = false;
		String ValMobNum= null;
		while(nameval == false) {
			System.out.println("Enter Mobile Number(Greater than 10 digits):");
			String MobNum = console.next();
			MobNum = ValidationClass.MobNumValidator(MobNum);
			nameval=ValidationClass.NullMethod(MobNum,nameval);
			ValMobNum= MobNum;
		}
		System.out.println("Enter Government Id:");
		String GovId = console.next();
		nameval = false;
		String ValOtp= null;
		while(nameval == false) {
			System.out.println("Enter Otp (5-digits):");
			String Otp = console.next();
			Otp = ValidationClass.OtpValidator(Otp);
			nameval=ValidationClass.NullMethod(Otp,nameval);
			ValOtp = Otp;
		}
		nameval = false;
		String ValPass= null;
		while(nameval == false) {
			System.out.println("Enter Password:");
			String Pass = console.next();
			Pass = ValidationClass.PassValidator(Pass);
			nameval=ValidationClass.NullMethod(Pass,nameval);
			ValPass = Pass;
		}
		nameval = false;
		String ValConfirmPass= null;
		while(nameval == false) {
			System.out.println("Confirm Password:");
			String ConfirmPass = console.next();
			ConfirmPass = ValidationClass.ConfirmPassValidator(ConfirmPass, ValPass);
			nameval=ValidationClass.NullMethod(ConfirmPass,nameval);
			ValConfirmPass = ConfirmPass;
		}
		Login l1 = new Login();
		l1.setName(ValName);
		l1.setAccNum(ValAccNum);
		l1.setMobNum(ValMobNum);
		l1.setGovId(GovId);	
		l1.setOtp(ValOtp);	
		l1.setPass(ValPass);
			if(list.contains(ValAccNum)) {
				System.out.println("Account Already Exist.Try Login");
			}
			else {
				list.add(ValAccNum);
				set1.add(l1);
				System.out.println(set1);
				System.out.println("Wallet is Succesfully Created");
				Login value= (Login)set1.get(list.indexOf(ValAccNum));
				Double bal = value.getBalance();
				System.out.println();
				addpayMoney.Money();
				boolean close = true;
				while(close) {
					Scanner input = new Scanner(System.in);
					String result = input.next();
					while (!"A".equalsIgnoreCase(result) && (!"B".equalsIgnoreCase(result))
							&& (!"C".equalsIgnoreCase(result)) && (!"D".equalsIgnoreCase(result))) {
						System.out.println("Invalid Choice");
						System.out.println("Enter a Valid input");
						result = console.next();
					}
					if ("C".equalsIgnoreCase(result)) {
						System.out.println("Return to main menu");
						Login_Menu();
						close = false;
					}
					if ("D".equalsIgnoreCase(result)) {
						String AccDetails = getDetails.WalletDetails(ValAccNum);
						System.out.println(AccDetails);
					}
					if ("A".equalsIgnoreCase(result)) {
						System.out.println("Enter Amount:");
					try {	
						Double amt = console.nextDouble();
						bal = addpayMoney.addMoney(bal, amt);
						value.setBalance(bal);
						System.out.println("Updated Balance is" + bal);
					  }catch(InputMismatchException e) {
						  System.out.println("Enter a valid Amount");
					  }
					}
					if ("B".equalsIgnoreCase(result)) {
						System.out.println("Enter Amount:");
						Double amt = console.nextDouble();
						try {
						System.out.println("Enter Consumer/Merchant Mobile No.:");
						String number1 = console.next();
						bal = addpayMoney.payMoney(bal,amt);
						value.setBalance(bal);
						System.out.println("Updated Balance is" + bal);
						addpayMoney.Money();
						addpayMoney.CheckMobNum(number1,amt);
						 }catch(InputMismatchException e) {
							  System.out.println("Enter a valid Amount");
						  }
					} else {
						addpayMoney.Money();
					}
				}			
			}
	}
}



