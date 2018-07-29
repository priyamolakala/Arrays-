package test;

public class RotationMatrix {

	public static void main(String[] args) {
		
		System.out.println(rotate(new int[][]{{1,2,3,4},{5,6,7,8},{2,3,4,1},{5,7,6,8}}));

	}
	
	public static boolean rotate(int[][] x) {
		if(x.length != x[0].length && x.length > 0 ) {
			return false;
		}
		int n = x.length;
		for(int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n-1-layer;
			for(int i = first; i < last; i++) {
				int offset = last - i;
				int top = x[first][i];
				x[first][i] = x[last - offset][first];
				x[last - offset][first] = x[last][last - offset];
				x[last][last - offset] = x[i][last];
				x[i][last] = top;
			}
		}
		return true;
		
	}

}
