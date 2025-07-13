class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int rem = 0;
        int reverse = 0;
        while(x>0){
            rem = x%10;
            x/=10;
            reverse = reverse*10 + rem;
        }
        return original == reverse;
    }
}