package Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class doubling {
    private List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).collect(Collectors.toList());
    }
}
