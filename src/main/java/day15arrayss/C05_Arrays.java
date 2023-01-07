package day15arrayss;

import java.util.Arrays;
import java.util.Comparator;

public class C05_Arrays {
    public static void main(String[] args) {

        //Arama motorunda guzel isimler aldi bir application icin isimleri
        //kucukten buyuge  siralayan kodu yaziniz.

        String arr[]={"Abrurrahman" , "Emre", "Yunus", "Ali", "Mehmet", "Can", "Veli"};
        System.out.println(Arrays.toString(arr));


        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));//[Ali, Can, Emre, Veli, Yunus, Mehmet, Abrurrahman]

        //String array elemanlarini karakter sayisina göre ve
        // ayni karakter sayisinda ise natural order(alfabetik siraya gore)'a gore
        //ve tersten buyukten kucuge dogru siralayiniz.

        String brr[]={"Abrurrahman" , "Emre", "Yunus", "Can", "Mehmet", "Ali", "Veli"};
        Arrays.sort(arr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(brr));//Alfabetik siraya göre buyuktem kucuge



    }
}
