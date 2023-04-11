package Array1;

public class reverse3 {
    private int[] reverse3(int[] nums) {
        int temp = 0;
        temp = nums[0];
        nums[0] = nums[2];
        nums[2] = temp;
        return nums;
    }
}
