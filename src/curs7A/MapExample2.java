package curs7A;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {

        Map<Integer, String> map =  new HashMap<>();
        map.put(1, "rosu");
        map.put(43, "negru");
        map.put(200, "alb");
        map.put(300, "alb");
        map.put(200, "verde");

        System.out.println(map);

        Map<Integer, String> map2 =  new HashMap<>();
        map2.put(23, "galben");
        map2.put(4, "mov");

        System.out.println(map2);

        map.putAll(map2);
        System.out.println(map);


    }

}
