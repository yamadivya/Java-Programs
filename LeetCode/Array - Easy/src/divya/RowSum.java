// https://leetcode.com/problems/richest-customer-wealth/

package divya;

public class RowSum {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++){
            int rsum = 0;
            for (int col = 0; col < accounts[row].length; col++){
                rsum += accounts[row][col];
            }
            max = Math.max(rsum, max);
        }
        return max;
    }
}
