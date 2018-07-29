package test;

public class PlusOne {
	
	public int[] plusOne(int[] nums) {
		int n = nums.length;
		for(int i=n-1; i>=0; i--) {
			if(nums[i]<9) {
				nums[i]++;
				return nums;
			}
			
			nums[i]=0;
		}
		
		int[] newnumber = new int[n+1];
		newnumber[0] = 1;
		return newnumber;
	}
	
	public static void main(String[] args) {
		PlusOne p = new PlusOne();
		p.plusOne(new int[] {6,7,9});
	}

}
