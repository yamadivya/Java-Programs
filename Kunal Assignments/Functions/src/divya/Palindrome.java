package divya;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        boolean res = isPalindrome(num);
        System.out.println(res);
    }

    static boolean isPalindrome(String num){
        int len = num.length();
        for(int i = 0; i < len / 2; i++){
            if (num.charAt(i) != num.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
