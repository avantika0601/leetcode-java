class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int majority_element=0;
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x,0)+1);
            if(mp.get(x) > nums.length/2){
                majority_element=x;
            }
        }
        return majority_element;
    }
}