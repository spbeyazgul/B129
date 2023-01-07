package buddy;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        Scanner sayi= new Scanner(System.in);
        int sayi1,toplam=0;

        System.out.println("ortalamasini  istenilen sayilalar giriniz");
        int adet=sayi.nextInt();
        for( int i = 0 ; i<adet; i++){
            System.out.println((i+1)+". sayiyi giriniz: " );
            sayi1 = sayi.nextInt();
        }
        System.out.println("sayiların ortalamasi = "+(float)toplam /adet);
    }
}

