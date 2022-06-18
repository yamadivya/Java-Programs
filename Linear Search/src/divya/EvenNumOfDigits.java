package divya;

public class EvenNumOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 43, 94, 21, 8};
        System.out.println(findNums(nums));
    }
    static int findNums(int[] nums){
        int count = 0;
        for (int num:nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check whether a number contains even digit or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    // count number of digits in a number
    static int digits(int num){
        int count = 0;
        while (num>0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
