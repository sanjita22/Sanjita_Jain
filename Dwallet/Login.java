
public class Login {
	private String name;
	private String accNum;
	private String mobNum;
	private String govId;
	private String Otp;
	double balance;
	private String Pass;
	
	
	
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	public void setGovId(String govId) {
		this.govId = govId;
	}
	public String getName() {
		return name;
	}
	public String getAccNum() {
		return accNum;
	}
	public String getMobNum() {
		return mobNum;
	}
	public String getGovId() {
		return govId;
	}
	public double getBalance() {
		return balance;
	}
	public double setBalance(double balance) {
		this.balance =balance;
		return balance;
	}
	
	public String getOtp() {
		return Otp;
	}
	public void setOtp(String otp) {
		Otp = otp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accNum == null) ? 0 : accNum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((govId == null) ? 0 : govId.hashCode());
		result = prime * result + ((mobNum == null) ? 0 : mobNum.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		if (accNum == null) {
			if (other.accNum != null)
				return false;
		} else if (!accNum.equals(other.accNum))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (govId == null) {
			if (other.govId != null)
				return false;
		} else if (!govId.equals(other.govId))
			return false;
		if (mobNum == null) {
			if (other.mobNum != null)
				return false;
		} else if (!mobNum.equals(other.mobNum))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Details [Name=" + name + ", AccNum=" + accNum + ", MobNum=" + mobNum + ", GovId=" + govId + ", Balance="
				+ balance + "]";
	}
}
