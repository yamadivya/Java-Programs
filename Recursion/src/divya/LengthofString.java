package divya;

public class LengthofString {
    public static void main(String[] args) {
        String str = "Divya";
        System.out.println(length(str));
    }

    static int length(String str){
        if (str.equals("")){
            return 0;
        }
        else
            return 1 + length(str.substring(1));
    }
}
