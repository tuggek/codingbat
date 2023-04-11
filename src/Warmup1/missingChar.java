package Warmup1;

public class missingChar {
    private String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n+1);
    }
}
