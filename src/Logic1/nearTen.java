package Logic1;

public class nearTen {
    private boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }
}