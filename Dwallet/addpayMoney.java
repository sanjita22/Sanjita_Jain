

public class addpayMoney extends DigWallet {
	public static Double addMoney(Double Bal,Double amt) throws Exception {
		try {
			if (amt <= 0)
	            throw new Exception( "Amount should be greater than zero");
		} catch(Exception e1) {
			System.out.println("Amount should be greater than zero");
		}
		try {
		if(amt>20000) 
			 throw new Exception("Amount should be less than 20000 INR");
		} catch(Exception e1) {
			System.out.println("Amount should be less than 20000 INR");
		}
		if(amt >0 && amt <20000)
		Bal = Bal + amt;
		return Bal;
	}
	

	public static void Money() {
		System.out.println("------------------------------------------------");
		System.out.println("A. Add Money ");
		System.out.println("B. Funds Transfer");
		System.out.println("C. Return to Main Menu");
		System.out.println("D. Retrive Account Details");
		System.out.println("------------------------------------------------");	
	}
	public static void CheckMobNum(String MobNum,Double amt) {
		try {
			Login value3 = (Login) set1.get(list.indexOf(MobNum));
			Double newBal = value3.getBalance();
			newBal = newBal + amt;
			value3.setBalance(newBal);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
	}
	public static Double payMoney(Double bal,Double Amt) throws Exception {
		
		try {
			if (Amt <= 0)
	            throw new Exception( "Amount should be greater than zero");
		} catch(Exception e1) {
			System.out.println("Amount should be greater than zero");
		}
		try {
			if(Amt > bal) 
				throw new Exception( "Insufficient Balance");	
		}catch(Exception e2) {
			System.out.println("Insufficient Balance");
			return bal;
		}
		if(bal>Amt && Amt>= 0) {
			bal = bal - Amt;
		}
		return bal;
		
	}
}
