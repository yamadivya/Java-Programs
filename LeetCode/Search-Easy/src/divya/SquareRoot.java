// https://leetcode.com/problems/sqrtx/

package divya;

public class SquareRoot {
    public int mySqrt(int x) {
        if (x <= 1) return x;
        int left = 0;
        int right = x;
        while(right - left > 1){
            int mid = (left + right) / 2;
            if (x / mid < mid) right = mid;
            else left = mid;
        }
        return left;
    }
}
