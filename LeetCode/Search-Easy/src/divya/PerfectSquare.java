// https://leetcode.com/problems/valid-perfect-square/

package divya;

public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;

        if(num == 1){
            return true;
        }
        while(start <= end){

            long mid = start + (end - start) / 2;
            long sqr = mid * mid;
            if(sqr == num){
                return true;
            }
            else if(sqr > num){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        } return false;
    }
}
