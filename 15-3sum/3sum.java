class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int target=0;
        List<List<Integer>> res = new ArrayList();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                target=nums[i]+nums[j]+nums[k];
                if(target==0){
                    List<Integer>a=List.of(nums[i], nums[j],nums[k]);
                    res.add(a);
                                    j++;
                k--;
                }
                else if(target>0){
                    k--;
                }
                else{
                    j++;
                }

            }
        }
        return res.stream().distinct().collect(Collectors.toList());
        
    }
}