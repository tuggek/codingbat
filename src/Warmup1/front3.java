package Warmup1;

public class front3 {
    private String front3(String str) {
        return str.length() <= 2 ? str + str + str : str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
    }
}
