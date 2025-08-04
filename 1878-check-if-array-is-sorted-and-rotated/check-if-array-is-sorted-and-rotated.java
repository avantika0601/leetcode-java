class Solution {
    public boolean check(int[] nums) {
        int desc_counter=0;
            for(int i=0;i<nums.length; i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                desc_counter++;
            }
        }
       return desc_counter<=1;
    }
}