package Warmup1;

public class icyHot {
    private boolean iceHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0);
    }
}
