package Map1;

import java.util.Map;

public class mapAB {
    private Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a").concat(map.get("b")));
        }
        return map;
    }
    
}
