package FibPrime;

import java.util.ArrayList;
public class FibonacciVeAsal extends FibonacciPrimeService{


    public static void main(String[] args) {
        ArrayList<Integer> arrayAsallar=asalSayilar(15);
        ArrayList<Integer> arrayFibonacci=fibonacciSayilar(15);
        for(int i=1;i<arrayAsallar.size();i++){
            if(arrayAsallar.contains(arrayFibonacci.get(i))){
                System.out.println("Hem Asal sayıdır hem de fibonacci serisinde mevcuttur:"+arrayFibonacci.get(i));
            }
        }
    }


    public static ArrayList<Integer> fibonacciSayilar(int sayiSinir){
        ArrayList<Integer> arrayFibonacci=new ArrayList<>();
        int sayi=1;
        int oncekiDeger=1;
        int sonrakiDeger=sayi+oncekiDeger;
        while(sayi<=sayiSinir){
            arrayFibonacci.add(sayi);
            oncekiDeger=sayi;
            sayi=sonrakiDeger;
            sonrakiDeger=oncekiDeger+sayi;
        }
        return arrayFibonacci;
    }
    public static ArrayList<Integer> asalSayilar(int sayiSinir){
        boolean AsalMi=true;
        ArrayList<Integer> arrayAsallar=new ArrayList<>();
        for(int i=2;i<=sayiSinir;i++){
            AsalMi=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    AsalMi=false;
                    break;
                }

            }
            if(AsalMi){
                arrayAsallar.add(i);
            }
        }
        return arrayAsallar;
    }
}