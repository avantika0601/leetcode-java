class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        if(n==0) return a;
        int i=2;
        while(i<=n){
            int c=a+b;
            a=b;
            b=c;
            i++;
        }
        return b;
    }
}