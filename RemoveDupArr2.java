package test;

public class RemoveDupArr2 {
	 public int removeDuplicates(int[] nums) {
	        
	        int i =0;
	        for(int num:nums){
	            if(i<2||num>nums[i-2]){
	                nums[i] = num;
	                i++;
	            }
	        }
	        return i;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
