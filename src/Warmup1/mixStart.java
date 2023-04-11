package Warmup1;

public class mixStart {
    private boolean mixStart(String str) {
        return str.length() > 2 ? str.substring(1,3).equals("ix") : false;
    }
}
