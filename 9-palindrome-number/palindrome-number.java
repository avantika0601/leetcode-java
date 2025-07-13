class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        
        while(x>0){
            numList.add(x%10);
            x/=10;
        }
        ArrayList<Integer> reverseNumList = new ArrayList<>(numList);
        Collections.reverse(reverseNumList);
        return(numList.equals(reverseNumList));

    }
}