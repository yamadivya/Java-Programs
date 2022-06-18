// https://leetcode.com/problems/first-bad-version/

package divya;

public class BadVersion {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)){
                //If version at mid is bad,all versions to the right will be bad and 'right' can be moved to mid-1 to discard all bad versions
                end = mid - 1;
            } else {
                //If version at mid is good, versions to the left will be good and 'left' can be moved to mid+1
                start = mid + 1;
            }
        }
        if(isBadVersion(end)){
            return end;
        }
        return end + 1;
    }
}
