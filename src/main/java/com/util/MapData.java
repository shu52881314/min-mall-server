package com.util;

import lombok.Data;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class MapData {

    public static Map of(List data){
        Map map=new HashMap();
        map.put("dataList",data);
        return map;
    }

}
