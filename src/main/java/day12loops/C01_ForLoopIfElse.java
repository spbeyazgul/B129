package day12loops;

import java.util.Scanner;

public class C01_ForLoopIfElse {

    /*
    Kulllanicidan baslangic ve bitis degerlerini alin.
    Baslangic degerinden baslayip bitis degerine kadar tum tamsayilari ekrana yazdirin
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen baslangic degerini giriniz");
        int baslangic =input.nextInt();//10
        System.out.println("lutfen bitis degerini giriniz");
        int bitis=input.nextInt();//15

        if (baslangic>bitis){
            System.out.println("verdiginiz baslangic degeri bitis degerinden kucuk olmali");

        }else {

        }
                  for (int i = baslangic; i <=bitis ; i++) {
                   System.out.print(i+" ");

                   }//fori

        /*
    Kulllanicidan baslangic ve bitis degerlerini alin.
    Baslangic degerinden baslayip bitis degerine kadar tum cift tamsayilari ekrana yazdirin//10 12 14
     */

    }//main

}//class
