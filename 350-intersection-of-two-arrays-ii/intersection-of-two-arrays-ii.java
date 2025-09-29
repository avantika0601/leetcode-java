class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer>arr = new ArrayList<Integer>();
        int i=0, j=0;
        int n=nums1.length, m = nums2.length;
        while(i<n && j<m){
            if(nums1[i] == nums2[j]) {
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] result = new int[arr.size()];
        for (int k = 0; k < arr.size(); k++) {
            result[k] = arr.get(k);
        }

        return result;
    }
}