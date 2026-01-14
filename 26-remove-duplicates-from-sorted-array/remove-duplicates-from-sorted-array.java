class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int i=0, j=1;
        while(i<n && j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        return i+1;
    }
}