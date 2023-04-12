package Logic1;

public class teenSum {
    private int teenSuM(int a, int b) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) ? 19 : a + b;
    }
}
