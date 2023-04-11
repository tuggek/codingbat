package Warmup1;

public class close10 {
    private int close10(int a, int b) {
        if(Math.abs(a-10) > Math.abs(b-10)) return b;
        if(Math.abs(b-10) > Math.abs(a-10)) return a;
        if(Math.abs(a-10) == Math.abs(b-10)) return 0;
        return -1;
    }
}
