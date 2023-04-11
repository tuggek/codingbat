package Array1;

public class frontPiece {
    private int[] frontPiece(int[] nums) {
        return nums.length <= 2 ? nums : new int[] {nums[0], nums[1]};
    }
}
