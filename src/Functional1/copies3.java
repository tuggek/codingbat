package Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class copies3 {
    private List<String> copies3(List<String> strings) {
        return strings.stream().map(n -> n.concat(n.concat(n))).collect(Collectors.toList());
    }
}

