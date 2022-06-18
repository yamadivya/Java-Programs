// https://leetcode.com/problems/reverse-bits/
package divya;

public class ReverseBits {
    public int reverseBits(int n) {
        /* 1. Picking last bit by AND
           2. Moving the bit to left most on 1st iteration
           3. Storing it in ans variable
           4. Right shift original number by 1 so that can take 2nd rightmost digit
         */
        int ans = 0;

        for(int i = 31;i>=0;i--)
        {
            int res = n&1;
            res = res<<i;
            ans = ans|res;
            n = n>>1;
        }
        return ans;
    }
}
