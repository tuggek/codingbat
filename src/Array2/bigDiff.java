package Array2;

public class bigDiff {
    private int bigDiff(int[] nums) {
        int diff = 0, max = 0, min = nums[nums.length-1];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
            diff = Math.abs(max - min);
        }   
        return diff;
    }
}
