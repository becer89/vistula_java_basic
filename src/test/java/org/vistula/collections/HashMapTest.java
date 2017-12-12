package org.vistula.collections;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    @Test
    public void HashMapPlayground() {
       //HashMap<Integer, String> daysOfWeek = new HashMap<Integer, String>();


        Map<String, String> pairsMap = new HashMap<>();
        pairsMap.put("Marcin", "Adela");
        pairsMap.put("Marek", "Magda");

        Map<String, String> otherPairsMap = new HashMap<>();
        //otherPairsMap.put("Marek", "Ewa");
        otherPairsMap.put("Adam", "Ewa");

        pairsMap.putAll(otherPairsMap);

        System.out.println(pairsMap.get("Marek"));
        System.out.println(pairsMap.remove("Marek"));
        System.out.println(pairsMap.size());
        System.out.println(pairsMap.isEmpty());
        System.out.println(pairsMap.containsKey("Jan"));
        System.out.println(pairsMap.containsValue("Adela"));
    }
}