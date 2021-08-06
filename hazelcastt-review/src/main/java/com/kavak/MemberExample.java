package com.kavak;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

import java.util.Random;

public class MemberExample {
    public static void main(String[] args) {

        HazelcastInstance hzInstance = Hazelcast.newHazelcastInstance();
        IMap<Object,Object> storedData = hzInstance.getMap("mapTesting");

        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i =0; i < 100000; i++){
        	storedData.put(i,random.nextInt(100000));
        }
        long elapsedTime = System.nanoTime() - startTime;
        double secondsChange = (double)elapsedTime / 1000000000.0;
        System.out.println(secondsChange);

    }
}