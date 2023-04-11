package Warmup1;

public class notString {
    private String notString(String str) {
        if(str.startsWith("not")) return str;
        return "not " + str;
    }
}
