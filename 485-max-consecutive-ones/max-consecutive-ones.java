class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int maxSum=0;
        for(int x:nums){
            if(x!=0){
                sum+=x;
            }
            else{
                maxSum=Math.max(sum, maxSum);
                sum=0;
            }
        }
        return Math.max(maxSum, sum);
    }
}