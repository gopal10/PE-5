package com.stackroute.pe5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ReplaceValues {

    public HashMap<String,String> check(HashMap<String, String> map)
    {
        map.replace("val2",map.get("val1"));
        map.replace("val1"," ");
        return map;
    }
}
