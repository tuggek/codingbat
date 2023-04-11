package Warmup1;

public class front22 {
    private String front22(String str) {
        return str.length() <= 2 ? str + str + str : str.substring(0,2) + str + str.substring(0,2);
    }
}
