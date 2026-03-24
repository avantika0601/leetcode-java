class Solution {
    public int mySqrt(int x) {
        if(x<2)return x;
        int low=1;
        int high=x/2;
        while(low<=high){
            int mid=low+(high-low)/2;
            long prod=(long)mid*mid;
            if(prod==x){
                return mid;
            }
            else if(prod>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return high;
    }
}