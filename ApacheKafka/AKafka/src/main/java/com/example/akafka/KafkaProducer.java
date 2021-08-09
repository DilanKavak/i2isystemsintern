package com.example.akafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private   String topic="dilankavak";  //topic oluşturuldu.

    @Autowired
    private KafkaTemplate<String, Sayi> kafkaTemplate;
//private KafkaTemplate<String, String> kafkaTemplate;


    public  void writeMessage(Sayi msg){
        System.out.println("Producter da");
        this.kafkaTemplate.send(topic,msg);
        System.out.println("Producter topic de");


    }

}