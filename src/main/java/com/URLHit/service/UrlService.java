package com.URLHit.service;

import com.URLHit.model.Url;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlService {
    int c=0;
    public int getHitCount() {
        return ++c;
    }
    static Map<String,Integer> map=new HashMap<>();
    public static Url getVisits(String yourusername) {
        int count=map.getOrDefault(yourusername,0)+1;
        map.put(yourusername,count);
        Url url=new Url(count,yourusername);
        return url;
    }
}
