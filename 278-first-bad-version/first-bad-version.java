/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1;
        int high=n;
        int prev_bad=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            boolean bad=isBadVersion(mid);
            if(bad==true)
            {prev_bad=mid;
            high=mid-1;
            }
            else if(bad==false)
            {
                low=mid+1;
            }
        }
        return prev_bad;
    }
}