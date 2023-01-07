package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrarLists01 {
    public static void main(String[] args) {

  /*
  1)Arraylist'ler coklu data depolamak icin kullanilir.
  2)Arraylist'ler non-primitive data type'indeki coklu datalari depolamak icin kullanilir.
    List'ler "non-primitive" data kabul ederler,"Array"ler ise "primitive" data veya referce kabul eder.
  3)Arraylist'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yok.
    List'ler eleman sayisinda "flexible" dirlar ama "Array"ler "flexible" degildirler.
  4)Madem "Array"ler eleman sayisinda flexiblle degil nicin Java "Array"leri iptal etmedi?
   i)Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
   ii)Array'ler cok hizli calisir.
   iii)Array'ler memory'de cok az yer kaplar.

    Array ile ArrayList'in farki nedir?

1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini
  soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
  Array'ler eleman sayisinda "fixed" dirler.
  ArrayList'leri olustururken eleman sayisi soylemeye gerek yok,
  cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
2)Array'lerin icine "primitive" ve "reference" lar konabilir.
  ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
  Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin
  Array kullaniriz, ama eleman sayisi degisken olan coklu datalar icin
  Array kullanma riskini almayin

   */
        // List nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);//[]

        //List'lere eleman nasil eklenir?
        //List'e eleman eklemek icin add() method'unu kullaniriz.
        //add() method'u elemanlari sizin verdiginiz sirada "List"ekler(Insertion Order)
        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(888);

        ages.add(1,656);
        ages.add(3,777);
        System.out.println(ages);//[12, 656, 9, 777, 10, 888]

        //List'e coklu eleman nasil eklenir? veya List'e baska bir List nasil eklenir?
        //Bir "List" coklu eleman eklemek, o elemanlari once bir List'in icine koymalisiniz.

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);
        System.out.println(ages);//[12, 656, 9, 777, 10, 888, 8, 9, 10]

        //Bir List'tedi tum elemanlari nasil silebilirim?
      //  ages.clear();
      //  System.out.println(ages);//[]

        //Bir elemanin List'te var olup olmadigini nasil kontrol ederiz?
        boolean r = ages.contains(656);
        System.out.println(r);//true

        //Bir List'in baska bir List ile ayni olup olmadigini nasil kontrol ederiz?
        //İki List'in esit olmasi icin ayni index te ayni eleman olmalidir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Jim");
        names2.add("Kim");

        boolean s= names1.equals(names2);
        System.out.println(s);//false

        // Example 1) Verilen 2 İnteger List'te tamamiyla ayni elemanlari olup olmadigini kontrol eden kodu yaziniz

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);
       boolean t = nums1.equals(nums2);
        System.out.println(t);



    }
}
