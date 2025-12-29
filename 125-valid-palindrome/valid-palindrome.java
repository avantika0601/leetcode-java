class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int first=0;
        int last=n-1;
        while(first<=last)
        {
            if(!Character.isLetterOrDigit(s.charAt(first))) first++;
            else if(!Character.isLetterOrDigit(s.charAt(last))) last--;
            else{
                if(Character.toLowerCase(s.charAt(first))!=Character.toLowerCase(s.charAt(last))) {return false;}
            first++;
            last--;
            }
            
        }
        return true;
}
}