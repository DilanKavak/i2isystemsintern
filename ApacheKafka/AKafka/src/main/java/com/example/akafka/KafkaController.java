package com.example.akafka;

import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping()

    public class KafkaController {

        private final KafkaProducer producer;

        private  KafkaController(KafkaProducer producer){
            this.producer  =producer;
        }


        @PostMapping("/publish")
        public void  writeMessageToTopic(@RequestBody Sayi message){
            System.out.println(message.toString());
            this.producer.writeMessage(message);

        }}


