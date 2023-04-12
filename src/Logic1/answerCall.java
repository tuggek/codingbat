package Logic1;

public class answerCall {
    private boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return (!isAsleep && (isMorning && isMom)) || (!isAsleep && !isMorning);
    }
}
