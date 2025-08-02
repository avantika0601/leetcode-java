class Solution {
    public List<Integer> generateRow(int n){
        List<Integer> row = new ArrayList<Integer> ();
        Integer ans = 1;
            row.add(ans);
        for(int c=1; c<n; c++){
            ans = ans*(n-c);
            ans/=c;
            row.add(ans);

        }
        return row;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            triangle.add(generateRow(i));
        }
        return triangle;
    }
}