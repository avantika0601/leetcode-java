class Solution {
    public int bitwiseComplement(int n) {
        int c=0;
        int complement=0;
        if(n==0)return 1;
        while(n>0){
            int r=n%2;
            n=n/2;
            if(r==0){
                complement+= Math.pow(2,c);
            }
            c++;
        }
        return complement;
    }
}