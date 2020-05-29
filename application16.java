	
public class application16 {
	public static void main(String[] args) {
		int intValue = 88;
		short shortValue = 256;
		byte byteValue = 127;
		long LongValue = 34856;
		float floatValue= 346.65f;
		double doubleValue = 45967.3566;
		intValue = (int)LongValue;
		System.out.println(intValue);
		intValue= (int)floatValue;
		System.out.println(intValue);
		LongValue = (long)doubleValue;
		System.out.println(LongValue);
	}
}
