class Solution {
    public String makeFancyString(String s) {
        int i=1,count=1;
        int n=s.length();
        StringBuilder str=new StringBuilder();
        str.append(s.charAt(0));
        char c=s.charAt(0);
        while(i<n){

            if(count<2 && c==s.charAt(i))
            {
            str.append(s.charAt(i));
            count++;
            }
            else if(c!=s.charAt(i)){
                c=s.charAt(i);
                count=1;
                str.append(s.charAt(i));
            }
                i++;
            
                
            
        }
        return str.toString();
    }
}