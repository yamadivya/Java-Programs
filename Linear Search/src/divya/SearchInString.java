package divya;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Divya";
        char target = 'v';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char ch){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (ch == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
