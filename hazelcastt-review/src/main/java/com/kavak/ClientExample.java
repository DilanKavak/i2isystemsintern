package com.kavak;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class ClientExample {
    public static void main(String[] args) throws InterruptedException {
        HazelcastInstance clientInstance = HazelcastClient.newHazelcastClient();
        IMap<Object,Object> storeddata = clientInstance.getMap("mapTesting");

        int value = 0;
        long startTime = System.nanoTime();
        Object randomNumber = 0;
        while(randomNumber!=null){
            randomNumber= storeddata.get(value);
            value++;
        }
        long elapsedTime = System.nanoTime() - startTime;
        double secondschange = (double)elapsedTime / 1000000000.0;
        System.out.println(secondschange);
    }
}