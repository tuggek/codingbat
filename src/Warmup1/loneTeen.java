package Warmup1;

public class loneTeen {
    private boolean loneTeen(int a, int b) {
        boolean first = a >= 13 && a <= 19;
        boolean second = b >= 13 && b <= 19;
        return first != second;
    }
}
