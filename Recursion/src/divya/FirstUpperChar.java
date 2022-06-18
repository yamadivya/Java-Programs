package divya;

public class FirstUpperChar {
    public static void main(String[] args) {
        String str = "diVya";
        System.out.println(firstUpper(str,0));
    }

    static char firstUpper(String str, int i){
        if(str.charAt(i)=='\0'){
            return 0;
        }
        if(Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i);
        }
        return firstUpper(str, i+1);
    }
}
