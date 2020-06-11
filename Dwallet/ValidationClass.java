
public class ValidationClass extends DigWallet {
	public static boolean NameNullMethod(String newNameDetail,boolean nameval) throws Exception {
		try {
			if (newNameDetail.equals(null) || newNameDetail.isEmpty())
				throw new NullPointerException();
			else 
				nameval = true;
		} catch (NullPointerException e) {
			System.out.println("Name cannot be Empty or cannot contain number. \nPlease retry with valid Input");
		}
		return nameval;
	}
	
	public static boolean NullMethod(String newDetail,boolean nameval) throws Exception {
		try {
			if (newDetail.equals(null))
				throw new NullPointerException();
			else nameval= true;
		} catch (NullPointerException e) {
			System.out.println("Please retry with valid input.");
		}
		return nameval;
	}
	
	public static String NameValidator(String Name) {
		if (Name.matches(".*\\d.*")) {
			return null;
		} else
			return Name;
	}
	
	public static String AccNumValidator(String AccNum) throws Exception {
		boolean numeric = true;
		try {
			Long num = Long.parseLong(AccNum);
		} catch (NumberFormatException e) {
			numeric = false;
		}
		if (numeric && AccNum.length() > 10) {
			return AccNum;
		} else {
			System.out.println("Account number is not numeric or length is less than 10 digits");
			return null;
		}
	}
	public static String MobNumValidator(String MobNum) throws Exception {
		boolean numeric = true;
		try {
			Long num = Long.parseLong(MobNum);
		} catch (NumberFormatException e) {
			numeric = false;
		}

		if (numeric && MobNum.length() > 10) {
			return MobNum;
		} else {
			System.out.println("Mobile Number is not numeric or Length is less than 10 digits");
			return null;
		}
	}
	public static String OtpValidator(String Otp) throws Exception {
		boolean numeric = true;
		try {
			Integer num = Integer.parseInt(Otp);

		} catch (NumberFormatException e) {
			numeric = false;
	}
		if (numeric && Otp.length() == 5) {
			return Otp;
		} else {
			System.out.println("OTP is not numeric or Length is not 5 digits");
			return null;
		}
	}
	public static String PassValidator(String Pass) {
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$"; 
		if (Pass.matches(regex)) {
			return Pass;
		} else {
			System.out.println("PLease provide a strong password");
			return null;
		}
	}
	public static String ConfirmPassValidator(String Pass,String ValPas) {
		if (!Pass.equals(ValPas)) {
	        System.out.println("The password entered here  is invalid");
	        return null;
		} else {
			return ValPas;
		}
	}
	
	
	

}
