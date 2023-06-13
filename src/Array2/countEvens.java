package Array2;

public class countEvens {
    private int countEvents(int[] nums) {
        int count = 0;
        for(int i : nums) 
            if(i % 2 == 0) count++;
        return count;
    }
}
