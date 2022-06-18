// https://leetcode.com/problems/k-th-symbol-in-grammar/
// Explanation : https://www.youtube.com/watch?v=5P84A0YCo_Y
package divya;

public class KthSymbolGrammar {
    public int kthGrammar(int n, int k) {
        if (n == 1 || k == 1) return 0;
        int mid = (int)Math.pow(2,n - 1) / 2;
        if (mid >= k) return kthGrammar(n - 1, k);
        return kthGrammar(n - 1, k - mid) ^ 1;
    }
}
