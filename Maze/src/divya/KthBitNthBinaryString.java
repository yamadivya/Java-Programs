// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
package divya;

public class KthBitNthBinaryString {
    public char findKthBit(int n, int k) {
        String Sn = "0";
        for(int i=2;i<=n;i++) {
            Sn += "1" + reverse(invert(Sn));
        }
        return Sn.charAt(k-1);
    }

    private String reverse(String binary) {
        return new StringBuilder(binary).reverse().toString();
    }

    private String invert(String binary) {
        StringBuilder invert = new StringBuilder();
        for(char bit: binary.toCharArray()) {
            invert.append(bit == '1' ? '0' : '1');
        }
        return invert.toString();
    }
}
