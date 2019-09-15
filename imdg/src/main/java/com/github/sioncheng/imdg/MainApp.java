package com.github.sioncheng.imdg;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class MainApp {

    public static void main(String[] args) {
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();

        IMap<String, Integer> stringIntegerIMap = hazelcastInstance.getMap("stringIntegerIMap");

        System.out.println(stringIntegerIMap == null);

        stringIntegerIMap.put("One", 1);

        System.out.println(stringIntegerIMap.get("One"));

        SimpleUtil.sleepInSeconds(2);

        hazelcastInstance.shutdown();
    }
}
