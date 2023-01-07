package day03scanner.dday3scanner;

import java.util.Scanner;

public class Scannner04 {

    public static void main(String[] args) {
    //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input =new Scanner(System.in);

        System.out.println("iki sayi giriniz...");//5  2

         double firsNumber = input.nextDouble();

         double secondNumber = input.nextDouble();

        System.out.println(firsNumber + secondNumber);//7.0

        System.out.println(firsNumber - secondNumber);//3.0

        System.out.println(firsNumber * secondNumber);//10.0

        System.out.println(firsNumber / secondNumber);//2.5

    }
}
