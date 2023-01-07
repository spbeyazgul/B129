package day11loops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        // 5'den 10'a kadar tamsayilarin toplamini bulan kodu yaziniz.
        int sum=0;
        for (int i = 5; i <11 ; i++) {
            sum=sum+i;

        }
        System.out.println(" 5 den 10 a kadar sum :"+sum);//:45


        // 6 dan 3 e kadar olan tamsayilarin carpimini bulan kodu yazin.

        int Multiply=1;
        for (int i = 6; i >2; i--) {
            Multiply=Multiply*i;

        }//for

        System.out.println("carpim: "+Multiply);//Multiply:360
        
        // Bir tam sayinin rakamlarinin toplamini yazan kodu olusturunuz.
        // 2543 ==> 2+5+4+3=14


        Scanner input =new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int num=input.nextInt();
        num= Math.abs(num);

        int sonuc =0;

        for (int i =num; i >0; i=i/10) {
            sonuc=sonuc+i%10;
            
        }//for

        System.out.println(sonuc);



    }//main


}//class
