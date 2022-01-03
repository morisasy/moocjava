package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("myName", "Justme");
        map.put("actor", "john");
        map.put("ceo", "Marisa");


        System.out.println(map);
        System.out.println(map.get("actor"));
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + ' '+ map.get(key));
        }


    }
}
