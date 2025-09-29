class Solution {
    public int majorityElement(int[] nums) {
        int elem=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=elem){
                count--;
            }
            else if(nums[i]==elem){
                count++;
            }
            if(count==0){
                elem=nums[i];
                count=1;
            }
        }
        return elem;
}
}