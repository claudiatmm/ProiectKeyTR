package curs7A;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {


        //List<String> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("T", "Tester");
        map.put("D", "Developer");
        map.put("M", "Manager");
        map.put("P", "ProductOwner");

        System.out.println(map.isEmpty());
        System.out.println(map.size());

        System.out.println(map.containsKey("X"));

        System.out.println(map.get("T"));
        //System.out.println(map.get("Developer"));null --> pt ca parametru trebuie sa fie cheie

        System.out.println(map.containsValue("Manager"));

        for(String key : map.keySet()) {
            System.out.println(key);
        }

        for(String value : map.values()) {
            System.out.println(value);
        }



    }
}
