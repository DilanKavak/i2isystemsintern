package com.kavak;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

import java.util.Random;

public class MemberExample {
    public static void main(String[] args) {

        HazelcastInstance hzlcstinstance = Hazelcast.newHazelcastInstance();
        IMap<Object,Object> map = hzlcstinstance.getMap("mapTesting");

        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i =0; i < 100000; i++){
            map.put(i,random.nextInt(100000));
        }
        long elapsedTime = System.nanoTime() - startTime;
        double secondschange = (double)elapsedTime / 1000000000.0;
        System.out.println(secondschange);

    }
}