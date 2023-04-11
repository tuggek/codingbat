package Logic1;

public class cigarParty {
    private boolean cigarParty(int cigars, boolean isWeekend) {
        return (cigars >= 40 && cigars <= 60) || isWeekend && cigars >= 40;
    }
}
