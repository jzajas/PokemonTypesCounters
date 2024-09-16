package com.zajdsky.typesCounters.Templates;

import java.util.HashMap;
import java.util.Map;

//TODO possible change of how to store type information
public class Types {
    public static final Map<String, String[]> Fairy;

    static {
        Map<String, String[]> tempMap = new HashMap<>();
        tempMap.put("weak", new String[]{"Poison", "Steel"});
        tempMap.put("strong", new String[]{"Dragon", "Dark", "Fighting"});
        Fairy = tempMap;
    }

}
