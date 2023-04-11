package Warmup1;

public class startHi {
    private boolean startHi(String str) {
        return str.length() > 1 ? str.substring(0,2).equals("hi") : false;
    }
}
