package Array1;

public class double23 {
    private boolean double23(int[] nums) {
        if(nums.length < 2) return false;
        if(nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3) return true;
        return false;
      }
}
