package Array1;

public class sum2 {
    private int sum2(int[] nums) {
        if(nums.length < 1) return 0;
        return nums.length <= 2 ? nums[0] + nums[1] : nums[0] + nums[1] + nums[2];
    }
}
