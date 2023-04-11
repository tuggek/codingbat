package Logic1;

public class alarmClock {
    private String alarmClock(int day, boolean vacation) {
        if(vacation && (day == 0 || day == 6)) return "off";
        if(vacation && (day >= 1 && day <= 6)) return "10:00";
        if(!vacation && (day == 0 || day == 6)) return "10:00";
        if(!vacation && (day >= 1 && day <= 6)) return "7:00";
        return "";     
    }
}
