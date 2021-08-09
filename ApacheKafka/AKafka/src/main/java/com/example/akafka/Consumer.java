package com.example.akafka;
import FibPrime.FibonacciPrimeService;
import FibPrime.FibonacciVeAsal;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
class Consumer {


    @KafkaListener(topics = "dilankavak",groupId = "dilankavak_id") //topici dinlemeye yardımcı komut
    public void getMessage(Sayi message){
        System.out.printf(message.toString()); //message oku.
      FibonacciPrimeService fibonacciPrimeService=new FibonacciVeAsal();
      ((FibonacciVeAsal) fibonacciPrimeService).isFibAndPrime(message);


    }





}