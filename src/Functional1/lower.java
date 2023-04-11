package Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class lower {
    private List<String> lower(List<String> strings) {
        return strings.stream().map(n -> n.toLowerCase()).collect(Collectors.toList());
    }
    
}
