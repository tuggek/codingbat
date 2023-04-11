package Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class square {
    private List<Integer> square(List<Integer> nums) {
        return nums.stream().map(n -> n * n).collect(Collectors.toList());
    }
   
}
