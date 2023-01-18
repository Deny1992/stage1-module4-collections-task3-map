package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String, Integer> map = new HashMap<>();
        for(Map.Entry<Integer, String> entry : sourceMap.entrySet()){
            if(map.containsKey(entry.getValue())) {
                Integer newValue = entry.getKey();
                Integer currentValue = map.get(entry.getValue());
                map.put(entry.getValue(),
                        newValue < currentValue ? newValue : currentValue);
            }else {
                map.put(entry.getValue(), entry.getKey());
            }
        }
        return map;
    }
}
