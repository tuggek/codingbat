package Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class moreY {
    private List<String> moreY(List<String> strings) {
        return strings.stream().map(n -> "y".concat(n.concat("y"))).collect(Collectors.toList());
    }
}
