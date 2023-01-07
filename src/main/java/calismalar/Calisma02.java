package calismalar;

import java.util.Scanner;

public class Calisma02 {

    public static void main(String[] args) {

        // ORNEK 1 : Ogrenci ismi variable olusturup deger olarak Ali Can atayiniz.
        String name ="Ali Can";
        System.out.println(name);
        //ORENEK 2: chr data type'inda ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        Scanner sc = new Scanner(System.in);


        //ORNEK 3: boolean data type'inde emeklimisin bir variable oluturun ve false degeri atayin.
        boolean emekliMi= false;
        System.out.println(emekliMi);
        // ORNEK 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz
          byte stdAge = 16;
        System.out.println(stdAge);

        //ORNEK 5: short data type'inda site nufusu icin bir variable olusturun ve deger atayiniz
             short siteSakinleri = 318;
        System.out.println("siteSakinleri = " + siteSakinleri);

        // ORNEK 6: Ulke nufusu icin variable olusturun ve deger atayiniz
         long ulkeNufusu = 84000000L;
        System.out.println(ulkeNufusu);
        // ORNEK 7: long data type'inda insan vucundaki hucre sayisi icin variable olusturup deger atamasi yapin
          long hucre=2154687962565665L;
        System.out.println(hucre);

        // Method Creation
        // 1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz

        int kisa=10;
        int uzun=15;
        System.out.println(kisa*uzun);

        // 2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kisa kenar giriniz");
        int ksa = scan.nextInt();

        System.out.println("Lutfen uzun kenar giriniz.");
        int  uzn= scan.nextInt();

        System.out.println("cevre"+2*(kisa+uzun));

        // 3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        double pi=3.14;
        double yariCap =3;
        double daireCevre = 2*(pi*yariCap);

        System.out.println(daireCevre);

        // 4)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz

        double yariCap1 = 8;
        double pi1= 3.14;
       // double daireninAlani=yariCap1*yariCap1*pi1;
        System.out.println("dairenin alani"+yariCap1*yariCap1*pi1 );
        // ORNEK 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin
        double hucreAgirligi=0.0005;
        double amipAgirligi=0.00007;
        double fark = hucreAgirligi-amipAgirligi;


        // ORNEK 1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin.
        String Kirikkale = "11000";

        System.out.println(Kirikkale);
    }







}
