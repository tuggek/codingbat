package Array1;

public class maxEnd3 {
    private int[] maxEnd3(int[] nums) {
        if(nums[0] >= nums[2]) {
            nums[1] = nums[0];
            nums[2] = nums[0];
        }
        if(nums[2] >= nums[0]) {
            nums[0] = nums[2];
            nums[1] = nums[2];
        }
        return nums;
    }
}
