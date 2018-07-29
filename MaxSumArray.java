package test;

public class MaxSumArray {
	public int maxSubArray(int[] nums) {
        int curr_max = 0; int max_so_far = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(curr_max < 0){
                curr_max = 0;
            }
            if(curr_max == Integer.MAX_VALUE){
                return curr_max;
            }
            curr_max+=nums[i];
            max_so_far= Math.max(curr_max,max_so_far);
            
      
}
          return max_so_far;
}

}
