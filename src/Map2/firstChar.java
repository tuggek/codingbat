package Map2;

import java.util.HashMap;
import java.util.Map;

public class firstChar {
    private static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        String s = "";
        
        for(int i = 0; i < strings.length; i++) {
            for(int j = i+1; j < strings.length; j++) {
                if(strings[i].charAt(0) == strings[j].charAt(0)) {
                    s.concat(strings[i].concat(strings[j]));
                }
            }
            map.put(s.substring(0,1), s);
            s = "";
        }        
        return map;
    }
}
