package Array1;

public class make2 {
    private int[] make2(int[] a, int[] b) {
        if(a.length > 1) return new int[]{a[0], a[1]};
        if(a.length < 1) return new int[] {b[0], b[1]};
        if(b.length < 1) return new int[] {a[0], b[1]};
        if(a.length == 1 && b.length > 0) return new int[] {a[0], b[0]};
        if(a.length < 1 || b.length < 1) return new int[] {};
        return new int[] {};
    }
}
