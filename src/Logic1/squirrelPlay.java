package Logic1;

public class squirrelPlay {
    private boolean squirrelPlay(int temp, boolean isSummer) {
        return (isSummer && (temp >= 60 && temp <= 100)) || temp >= 60 && temp <= 90;
    }
}
