
public class getDetails extends DigWallet {
	public static String WalletDetails(String AccNum) {
		Login value= (Login)set1.get(list.indexOf(AccNum));
		Double bal = value.getBalance();
		String Name = value.getName();
		String MobNum = value.getMobNum();
		String GovId = value.getGovId();
		String Otp = value.getOtp();
		String Details =(" Name is :        " + Name +"\n Mobile Number is :" + MobNum + "\n Account Number is :" + AccNum + "\n Goverment Id is : " + GovId +"\n Otp is :          " + Otp +"\n Balance is :     " + bal) ;
		return Details;
	}
	
	
	
}
