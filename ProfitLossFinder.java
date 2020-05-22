import java.util.Scanner;


public class ProfitLossFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter CostProce :");
		double CPrice = input.nextDouble();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter SellingPrice :");
		double SPrice = input1.nextDouble();
		
		double diff = 0d;
		if(CPrice > SPrice){
			diff = 	(CPrice - SPrice);
			System.out.println("Loss of " + diff);
		}
		else {
			diff = (SPrice - CPrice);
			System.out.println("Profit of " + diff);
			
		}
			
	}

}
