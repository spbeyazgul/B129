package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

  /*
    Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
       //      3 ==> 3*1=3 3*2=6 3*3=9 3*4=12... 3*10=30

   */

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz...");
        double num = input.nextDouble();


       int i =1;
       while (i<11){

           System.out.println(num+"*" + i +"=" + (num*i));

           i++;

       }

    // Example 2: Verilen bir string'de her harfin sonrasina "*" sembolunu ekleyiniz.
    //            Java ==> J*a*v*a*

        System.out.println("Bir kelime giriniz.");
       String word = input.next();
       String newWord ="";
       int k = 0;
       while (k<word.length()){

       newWord =newWord + word.charAt(k) + "*";
           k++;
       }
        System.out.println(newWord);//J*a*v*a*
    }
}
