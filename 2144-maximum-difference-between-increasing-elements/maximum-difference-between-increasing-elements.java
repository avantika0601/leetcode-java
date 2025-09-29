class Solution {
    public int maximumDifference(int[] nums) {
        int maxi=-1;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=nums.length-1;j>=0; j--){
        //         {
        //             if(i==j){
        //                 break;
        //             }
        //         }
        //         if( j>i && maxi< nums[j]-nums[i]) {
        //             maxi = nums[j] - nums[i];
        //         }
        //     }
        // }
        // return maxi>0?maxi:-1;
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>min){
                maxi = Math.max(nums[i]-min, maxi);
            }
            else{
                min=nums[i];
            }
        }
        return maxi;
}
}