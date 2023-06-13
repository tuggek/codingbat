package Map2;

import java.util.HashMap;
import java.util.Map;

public class word0 {
    private Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(String s : strings) {
            map.put(s,0);
        }
        
        return map;
    }
}
