package Warmup1;

public class everyNth {
    private String everyNth(String str, int n) {
        String newStr = "";
        for(int i = 0; i < str.length(); i+=n) {
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }
}
