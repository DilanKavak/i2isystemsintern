
package com.TDD.Fibonacciprime;
import java.util.ArrayList;
class FibonacciVeAsal{

    public static ArrayList<Integer> fibonacciSayilar(int sayiSinir){
        ArrayList<Integer> arrayFibonacci=new ArrayList<>();
        int sayi=1;
        int oncekiDeger=1;
        int sonrakiDeger=sayi+oncekiDeger;
        while(sayi<=sayiSinir) {
            arrayFibonacci.add(sayi);
            oncekiDeger = sayi;
            sayi = sonrakiDeger;
            sonrakiDeger = oncekiDeger + sayi;
        }
        for(int i=0;i<arrayFibonacci.toArray().length; i++){
            System.out.println( arrayFibonacci.get(i) + " ");
        }

        System.out.println();
        return arrayFibonacci;

    }


    public boolean checkIsPrime(int girilensayi) {
        boolean sonrakiDeger=true;
        if(girilensayi<2){
            sonrakiDeger=false;
            System.out.println(girilensayi+" Asaldır.\n");
            return sonrakiDeger;
        }
        else if(girilensayi>=2){
            for(int i=2;i<girilensayi-1;i++){
                if(girilensayi %i ==0){
                    sonrakiDeger=false;
                    i=girilensayi;

                    System.out.println(girilensayi+"Asal değildir.\n");
                    return sonrakiDeger;

                }
            }
        }
        System.out.println(girilensayi+" Asaldır. \n");
        return sonrakiDeger;
    }

    public boolean checkIsPrimeFibonacci(int girilensayi, int sayiSinir) {
        ArrayList<Integer> arrays= fibonacciSayilar(sayiSinir);
        if(checkIsPrime(girilensayi)){
            for(int i = 0; i< arrays.size(); i++){
                if(arrays.get(i) ==girilensayi){
                    System.out.println(girilensayi + " hem Asaldır hem de Fibonacci serisinde bulunur");
                    return true;
                }
            }

            System.out.println(girilensayi+"Asaldır fakat Fibonacci serisinde bulunmaz");
            return false;

        }
        else
        {
            for(int i=0;i<arrays.toArray().length;i++){
                if(arrays.get(i) ==girilensayi){
                    System.out.println(girilensayi+"Asal değildir fibonacci serisinde bulunur");

                    return false;
                }
            }

            System.out.println(girilensayi +"Asal değildir fibonacci sersinde bulunmaz");
            return false;
        }


    }
}
