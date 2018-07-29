package test;

public class ZeroMatrix {

	public static void main(String[] args) {
		setZeros(new int[][] {{1,2,3,0},{0,1,2,5},{1,2,3,4},{5,0,0,2}});

	}
	public static void setZeros(int[][] x) {
		boolean[] rows = new boolean[x.length];
		boolean[] columns = new boolean[x[0].length];
		 for(int i = 0; i < x.length -1; i++) {
			 for(int j = 0; j < x[0].length - 1; j++) {
				 if(x[i][j] == 0) {
					 rows[i] = true;
					 columns[j] = true;
				 }
			 }
		 }
		 for(int i = 0 ; i < rows.length - 1; i++) {
			 if(rows[i] == true) {
				 nullifyrow(x, i);
			 }
		 }
		 
		 for(int j = 0; j < columns.length - 1; j++) {
			 if(columns[j] == true) {
				 nullifycolumn(x, j);
			 }
		 }
		 
		 System.out.println(x[1][2]);
		 
	}
	public static void nullifyrow(int[][] x, int row) {
		for(int i = 0; i < x.length - 1; i++) {
			x[row][i] = 0;
		}
	}
		
		public static void nullifycolumn(int[][] x, int column) {
			for(int i = 0; i < x[0].length - 1; i++) {
				x[column][i] = 0;
			}
		 
	 }
}
