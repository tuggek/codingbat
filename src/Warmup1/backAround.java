package Warmup1;

public class backAround {
    private String backAround(String str) {
        return str.length() <= 1 ? str + str + str : str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }
}
