package Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class addStar {
    private List<String> addStar(List<String> strings) {
        return strings.stream().map(n -> n.concat("*")).collect(Collectors.toList());
    }
}
