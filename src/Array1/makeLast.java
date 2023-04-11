package Array1;

public class makeLast {
    private int[] makeLast(int[] nums) {
        int[] newInt = new int[nums.length*2];
        newInt[newInt.length-1] = nums[nums.length-1];
        return newInt;
    }
}
