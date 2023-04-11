package Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class noX {
    private List<String> noX(List<String> strings) {
        return strings.stream().map(n -> n.replaceAll("x", "")).collect(Collectors.toList());
    }
    
}
