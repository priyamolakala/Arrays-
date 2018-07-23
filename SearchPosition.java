package test;

public class SearchPosition {
	
	public int searchpos(int[] nums, int target) {
		int L = 0; int R = nums.length-1;
		int M = 0; 
		
		while(L<R) {
			M = L + (R - L)/2;
			if(nums[M] > target) {
				R = M;
			} else {
				L = M + 1;
			}
			
			if(target == nums[M]) {
				return M;
			}
		}
		return target>nums[L]?L+1:L;
		
	}

}
