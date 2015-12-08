package arrays;

public class MultiDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiDim multi = new MultiDim();
		multi.print2D(multi.get2D(6, 6));
	}
		public int[][] get2D(int rows, int columns) {
			
			int twoDimensional [][] = new int [rows][columns];
			
			for (int i = 0; i<rows; i++){
			
			for (int j = 0; j < columns; j++){
				
				twoDimensional [i][j] = i *j;
			}
			}
			return twoDimensional;
		}
		
		public void print2D (int [][] twoDimensional){
			
			for (int i = 0; i < twoDimensional.length; i++) {
				for (int j = 0; j < twoDimensional [i].length; j++){
					System.out.println(twoDimensional[i][j] + "\t");
				}
				System.out.println();
		}

	}
}

