package day08nestedif;

import java.util.Scanner;

public class C04_Ternary {

    /*
    // Kullanicidan iki sayi aliniz buyuk olmayan sayiyi yazdiriniz.

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        int sayi1 = input.nextInt();

        int sayi2 = input.nextInt();

        if (sayi1<sayi2){

            System.out.println("Buyuk olmayan sayi:" + sayi1);

        } else if (sayi1>sayi2) {
            System.out.println("Buyuk olmayan sayi : " + sayi2);


        }else {
            System.out.println("Sayilar Birbirine Esit");
        }


        // 2. Yol

        System.out.println(sayi1==sayi2 ?"Sayilar Esit" :sayi1>sayi2 ? sayi2 :sayi1 );



    }


}

