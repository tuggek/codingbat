package Map1;

import java.util.Map;

public class mapAB3 {
    private Map<String, String> mapAB3(Map<String, String> map) {
        if(map.containsKey("a") && !(map.containsKey("a") && map.containsKey("b"))) {
            map.put("b", map.get("a"));
        }
        if(map.containsKey("b") && !(map.containsKey("a") && map.containsKey("b"))) {
            map.put("a", map.get("b"));
        }
        return map;
    }
    
}
