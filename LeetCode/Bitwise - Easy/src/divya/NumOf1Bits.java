// https://leetcode.com/problems/number-of-1-bits/
package divya;

public class NumOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;

        for(int i = 31;i>=0;i--)
        {
            int res = n&1;
            if(res == 1){
                count+=1;
            }

            n = n>>1;
        }
        return count;
    }
}
