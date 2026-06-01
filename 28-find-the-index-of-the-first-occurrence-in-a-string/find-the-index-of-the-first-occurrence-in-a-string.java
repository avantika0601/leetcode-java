class Solution {
    public int strStr(String haystack, String needle) {

        int n=haystack.length();
        int m=needle.length();
        int i=0, j=0, k=0;
        if(m>n)return -1;
        while(k<n && i<n){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(j==m-1){
                return i-j;
            }
                j++;
                i++;
            }
            else if(haystack.charAt(i)!=needle.charAt(j)){
                j=0;
                k++;
                i=k;
            }
        }
        return -1;
    }
}