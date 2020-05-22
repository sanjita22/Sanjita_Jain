
public class Application7 {
	public static void main(String[] args) {
	int[][] grid={
			{12, 34, 56},
			{23, 57, 78},
			{35, 68, 89}
	};
	System.out.println(grid[0][1]);
	System.out.println(grid[1][1]);
	
	for (int row = 0; row <grid.length; row++){
		for (int col =0; col<grid[row].length; col++){
		System.out.print(grid[row][col] + "\t");
		}
		System.out.println();
	}
	}
}
