// https://leetcode.com/problems/happy-number/

package divya;

public class HappyNumber {
    public boolean isHappy(int n) {
        if(n == 1 || n == 7){
            return true;
        }

        if(n < 10){
            return false;
        }

        int sum = 0;
        while (n > 0){
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit;
            n /= 10;
        }
        if(isHappy(sum)){
            return true;
        }else{
            return false;
        }
    }
}
