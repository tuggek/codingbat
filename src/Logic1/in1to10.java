package Logic1;

public class in1to10 {
    private boolean in1to10(int n, boolean outsideMode) {
        return (outsideMode && (n <= 1 || n >= 10)) || (!outsideMode && (n >= 1 && n <= 10));
        
    }
}
