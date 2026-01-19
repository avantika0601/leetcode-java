class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x,0) + 1);
        }
        int x=mp.getOrDefault(0, 0);
        int y=mp.getOrDefault(1, 0);
        int z=mp.getOrDefault(2, 0);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        for(int i=0;i<x;i++){
            nums[i]=0;
        }
         for(int i=x;i<x+y;i++){
            nums[i]=1;
        }for(int i=x+y;i<x+y+z;i++){
            nums[i]=2;
        }

    }
}