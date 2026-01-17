class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        long sum1=(n*(n+1))/2;
        long sum2=Arrays.stream(nums).sum();
        return (int)sum1-(int)sum2;
        
    }
}