package CollectinPrograms.com;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("xyz", 30);
        map.put("abc", 25);
        map.put("sdf", 35);


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
