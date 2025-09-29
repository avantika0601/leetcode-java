class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x, 0) + 1);
            if(mp.get(x)>1){
                return true;
            }
        }
        return false;
    }
}