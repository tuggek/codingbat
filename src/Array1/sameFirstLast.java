package Array1;

public class sameFirstLast {
    private boolean sameFirstLast6(int[] nums){
        return nums.length >= 1 ? nums[0] == nums[nums.length-1] : false;
    }
}
