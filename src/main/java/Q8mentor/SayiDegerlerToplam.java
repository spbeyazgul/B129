package Q8mentor;

import java.util.Scanner;

public class SayiDegerlerToplam {
    public static void main(String[] args) {
       // Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

        int sayi = 34, toplam = 0;

        for(int i = 1; i <= sayi; ++i)
        {
            // toplam = toplam + i;
            toplam += i;
        }
        System.out.println("Toplam = " + toplam);
    }


    }



