package Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class math1 {
    private List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(n -> (n+1)*10).collect(Collectors.toList());
    }
    
}
