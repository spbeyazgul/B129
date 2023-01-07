package day03scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] asgs){

        // EX 1) Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz
        //1.Adimda Scanner Class'indan Object olusturun.
        Scanner input = new Scanner(System.in);

        //2.adim kullaniciya ne yapacagini soyle.
        System.out.println("Lutfen toplanacak olan ilk sayiyi giriniz");

        //3. Adim Kullanicidan aldiginiz datayı variable icine koyunuz.
        double syi1= input.nextDouble();
        double syi2 = input.nextDouble();

        System.out.println("Lutfen toplanacak olan ikinci sayiyi giriniz");
        System.out.println("Toplam "+(syi1 + syi2));




    }
}
