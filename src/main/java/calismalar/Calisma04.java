package calismalar;

import java.util.Scanner;

public class Calisma04 {
    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        //      3 ==> 3*1=3 3*2=6 3*3=9 3*4=12... 3*10=30

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen carpım tablosunu gormek icin sayi giriniz.");
        int num= input.nextInt();
        int i= 1;
        while (i<11){

            System.out.println(num+"*"+i+"="+(num*i));
            i++;

        }







    }
}
