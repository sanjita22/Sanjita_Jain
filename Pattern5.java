
public class Pattern5 {

	public static void main(String[] args) {
		int i ,j,k =0;
		for(i=1;i<=8;i++){
			for(j=0;j<8-i;j++){
				System.out.print(" ");
			}
			for(k=0;k<i;k++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
