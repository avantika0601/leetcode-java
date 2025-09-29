class Solution {
    public int maximumDifference(int[] nums) {
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>=0; j--){
                {
                    if(i==j){
                        break;
                    }
                }
                if( j>i && maxi< nums[j]-nums[i]) {
                    maxi = nums[j] - nums[i];
                }
            }
        }
        return maxi>0?maxi:-1;
}
}