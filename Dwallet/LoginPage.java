import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginPage extends DigWallet {
	public static void LoginData() throws Exception {
		Scanner scan = new Scanner(System.in);
		boolean nameval = false;
		String ValAccNum = null;
		while(nameval == false) {
		System.out.println("Enter Account Number:");
		String AccNum = scan.next();
		AccNum = ValidationClass.AccNumValidator(AccNum);
		nameval = ValidationClass.NullMethod(AccNum,nameval);
		ValAccNum = AccNum;
		}
		if(list.contains(ValAccNum)) {
			Login list1= (Login)set1.get(list.indexOf(ValAccNum));
			String MobNum = list1.getMobNum();
			System.out.println("Enter Password :");
			String Pass = scan.next();
			if(Pass.equals(list1.getPass())) {
				System.out.println("Login Succesful");
				Double bal = list1.getBalance();
				System.out.println();
				addpayMoney.Money();
				boolean option = true;
				while(option) {
					Scanner input2 = new Scanner(System.in);
					String result2 = input2.next();
					while (!"A".equalsIgnoreCase(result2) && (!"B".equalsIgnoreCase(result2)) && (!"C".equalsIgnoreCase(result2))  && (!"D".equalsIgnoreCase(result2))) {
						System.out.println("Invalid Choice");
						System.out.println("Enter a Valid input");
						result2 = input2.next();
					}
					if ("C".equalsIgnoreCase(result2)) {
						System.out.println("Return to main menu");
						Login_Menu();
						option = false;
					}
					if ("D".equalsIgnoreCase(result2)) {
						String AccDetails = getDetails.WalletDetails(ValAccNum);
						System.out.println(AccDetails);
					}
					if ("A".equalsIgnoreCase(result2)) {
						System.out.println("Enter Amount:");
						try {
						Double amt = input2.nextDouble();
						bal = addpayMoney.addMoney(bal, amt);
						list1.setBalance(bal);
						System.out.println("Updated Balance is" + bal);
						 }catch(InputMismatchException e) {
							  System.out.println("Enter a valid Amount");
						  }
					}
					if ("B".equalsIgnoreCase(result2)) {
						System.out.println("Enter Amount:");
						try {
						Double amt = input2.nextDouble();
						System.out.println("Enter Consumer/Merchant Mobile No.:");
						String number1 = input2.next();
						bal = addpayMoney.payMoney(bal,amt);
						list1.setBalance(bal);
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
		else {
			System.out.println("Invalid Password .PLease provide correct Password");
			Login_Menu();
		}
	}
	else {
		System.out.println("Account Number not found.Please try SignUp");
		Login_Menu();
	}
}

}

