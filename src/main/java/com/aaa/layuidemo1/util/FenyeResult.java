package com.aaa.layuidemo1.util;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FenyeResult {

    public  static <T> Map<String,Object>  fenye(List<T> data,Integer count){
        Map<String,Object> map =new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",data);
        return map;

    }
}
