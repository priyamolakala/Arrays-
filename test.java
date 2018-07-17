package test;


public class test {
	static int[] x = {1, 1, 2, 2, 3, 3, 4};
		

	public static void main(String[] args) {
		int d = 0;
		
		
		for(int i = 0; i < x.length; i++) {
			for(int j =1; j< x.length; j++) {
				
				if (i!=j) {
					if(x[i] == x[j]) {
						d++;
					}					
				}
				
					
				}
			if(d==0) {
				System.out.println(x[i]);
			}
			
	
	}

}
}